package com.desafioconpay.conpay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioconpay.conpay.dto.MenuDTO;
import com.desafioconpay.conpay.services.MenuService;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@GetMapping
	public ResponseEntity<List<MenuDTO>> findAll(){
		List<MenuDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
