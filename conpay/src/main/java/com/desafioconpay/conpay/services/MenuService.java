package com.desafioconpay.conpay.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafioconpay.conpay.dto.MenuDTO;
import com.desafioconpay.conpay.entities.Menu;
import com.desafioconpay.conpay.repositories.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository repository;
	
	@Transactional(readOnly = true)
	public List<MenuDTO> findAll(){
		List <Menu> list = repository.findMenuWithRegisters();
		return list.stream().map(x -> new MenuDTO(x)).collect(Collectors.toList());
		
		
	}

}
