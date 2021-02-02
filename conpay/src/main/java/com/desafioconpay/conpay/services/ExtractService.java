package com.desafioconpay.conpay.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafioconpay.conpay.dto.ExtractDTO;
import com.desafioconpay.conpay.dto.RegisterDTO;
import com.desafioconpay.conpay.entities.Extract;
import com.desafioconpay.conpay.entities.Register;
import com.desafioconpay.conpay.repositories.ExtractRepository;
import com.desafioconpay.conpay.repositories.RegisterRepository;

@Service
public class ExtractService {
	
	@Autowired
	private ExtractRepository repository;
	
	@Autowired
	private RegisterRepository registerRepository;
	
	
	@Transactional(readOnly = true)
	public List<ExtractDTO> findAll(){
		List <Extract> list = repository.findExtractWithRegisters();
		return list.stream().map(x -> new ExtractDTO(x)).collect(Collectors.toList());
		
		
	}
	
	@Transactional
	public ExtractDTO insert(ExtractDTO dto) {
		Extract extract = new Extract();
		for (RegisterDTO p : dto.getRegisters()) {
			
			Register register = registerRepository.getOne(p.getId());
//			RegisterDTO cpf = null;
			extract.getRegisters().add(register);
		}
		extract = repository.save(extract);
		return new ExtractDTO(extract);
	}

}
