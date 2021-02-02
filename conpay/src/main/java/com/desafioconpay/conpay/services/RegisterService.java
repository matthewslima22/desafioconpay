package com.desafioconpay.conpay.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import com.desafioconpay.conpay.dto.RegisterDTO;
import com.desafioconpay.conpay.entities.Register;
import com.desafioconpay.conpay.repositories.RegisterRepository;

@Service
@RequestMapping

public class RegisterService {
	
	@Autowired
	private RegisterRepository repository;
	
	@Transactional(readOnly = true)
	public List<RegisterDTO> findAll(){
		List <Register> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new RegisterDTO(x)).collect(Collectors.toList());
		
		
	}
	//@PostMapping("/registers")
	//public RegisterDTO salvaRegisterDTO(@RequestBody RegisterDTO register) {
	//Register Register = new Register(null, 
	//	dto.getName(), dto.getCpf(), dto.getAddress(), dto.getPassword(),  LoginStatus.SUCCESS);
		//for (MenuDTO p : dto.getMenu()) {
			
		//	Menu menu = RegisterRepository.getOne(p.getId());
//			RegisterDTO cpf = null;
		//	register.getMenu().add(menu);
	//	}
		//Register = repository.save(Register);
	
	//return new RegisterDTO(registerDTO);
	//}
}
