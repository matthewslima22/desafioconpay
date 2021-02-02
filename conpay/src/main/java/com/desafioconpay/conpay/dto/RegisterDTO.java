package com.desafioconpay.conpay.dto;

import java.io.Serializable;

import com.desafioconpay.conpay.entities.Register;

public class RegisterDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Long cpf;
	private String address;
	private String password;
	private Double balance = 100.00;

	
	public RegisterDTO() {
		
	}

	public RegisterDTO(Long id, String name, Long cpf, String address, String password, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.password = password;
		this.balance = balance;
	}
	
	public RegisterDTO(Register entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		address = entity.getAddress();
		password = entity.getPassword();
		balance = entity.getBalance();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
}
