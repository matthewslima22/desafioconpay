package com.desafioconpay.conpay.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafioconpay.conpay.dto.RegisterDTO;
import com.desafioconpay.conpay.entities.Register;
import com.desafioconpay.conpay.repositories.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository repository;
	
	@Transactional(readOnly = true)
	public List<RegisterDTO> findAll(){
		List <Register> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new RegisterDTO(x)).collect(Collectors.toList());
		
		
	}

}
