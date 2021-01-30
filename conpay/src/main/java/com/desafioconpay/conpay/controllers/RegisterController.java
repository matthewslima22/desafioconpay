package com.desafioconpay.conpay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioconpay.conpay.dto.RegisterDTO;
import com.desafioconpay.conpay.services.RegisterService;

@RestController
@RequestMapping(value = "/registers")
public class RegisterController {
	
	@Autowired
	private RegisterService service;
	
	@GetMapping
	public ResponseEntity<List<RegisterDTO>> findAll(){
		List<RegisterDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
