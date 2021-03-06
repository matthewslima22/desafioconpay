package com.desafioconpay.conpay.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafioconpay.conpay.dto.MenuDTO;
import com.desafioconpay.conpay.dto.RegisterDTO;
import com.desafioconpay.conpay.entities.LoginStatus;
import com.desafioconpay.conpay.entities.Menu;
import com.desafioconpay.conpay.entities.Register;
import com.desafioconpay.conpay.repositories.MenuRepository;
import com.desafioconpay.conpay.repositories.RegisterRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository repository;
	
	@Autowired
	private RegisterRepository registerRepository;
	
	
	@Transactional(readOnly = true)
	public List<MenuDTO> findAll(){
		List <Menu> list = repository.findMenuWithRegisters();
		return list.stream().map(x -> new MenuDTO(x)).collect(Collectors.toList());
		
		
	}
	
	@Transactional
	public MenuDTO insert(MenuDTO dto) {
		Menu menu = new Menu(null, dto.getBalance(), dto.getExtract(), dto.getTransfer(),
				dto.getPhonenumber(), dto.getCpf(), dto.getPassword(),  LoginStatus.SUCCESS);
		for (RegisterDTO p : dto.getRegisters()) {
			
			Register register = registerRepository.getOne(p.getId());
//			RegisterDTO cpf = null;
			menu.getRegisters().add(register);
		}
		menu = repository.save(menu);
		return new MenuDTO(menu);
	}

}
