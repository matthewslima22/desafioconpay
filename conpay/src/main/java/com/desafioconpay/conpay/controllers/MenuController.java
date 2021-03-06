package com.desafioconpay.conpay.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping	
	public ResponseEntity<MenuDTO> insert(@RequestBody MenuDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cpf}")
				.buildAndExpand(dto.getCpf()).toUri();
		return ResponseEntity.created(uri).body(dto);
		
	}

}
