package com.desafioconpay.conpay.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafioconpay.conpay.dto.OperationsDTO;
import com.desafioconpay.conpay.dto.RegisterDTO;
import com.desafioconpay.conpay.entities.Operations;
import com.desafioconpay.conpay.entities.Register;
import com.desafioconpay.conpay.repositories.OperationsRepository;
import com.desafioconpay.conpay.repositories.RegisterRepository;

@Service
public class OperationsService {
	
	@Autowired
	private OperationsRepository repository;
	
	@Autowired
	private RegisterRepository registerRepository;
	
	
	@Transactional(readOnly = true)
	public List<OperationsDTO> findAll(){
		List <Operations> list = repository.findOperationsWithRegisters();
		return list.stream().map(x -> new OperationsDTO(x)).collect(Collectors.toList());
		
		
	}
	
	@Transactional
	public OperationsDTO insert(OperationsDTO dto) {
		Operations operations = new Operations();
		for (RegisterDTO p : dto.getRegisters()) {
			
			Register register = registerRepository.getOne(p.getId());
//			RegisterDTO cpf = null;
			operations.getRegisters().add(register);
		}
		operations = repository.save(operations);
		return new OperationsDTO(operations);
	}

}
