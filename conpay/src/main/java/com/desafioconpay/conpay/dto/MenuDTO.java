package com.desafioconpay.conpay.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.desafioconpay.conpay.entities.LoginStatus;
import com.desafioconpay.conpay.entities.Menu;

public class MenuDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private Double balance = 100.00;
	private Double extract;
	private Double transfer;
	private Long phonenumber;
	private Long cpf;
	private String password;
	private LoginStatus login;
	
	private List<RegisterDTO> registers = new ArrayList<>();
	
	public MenuDTO() {
		
	}

	public MenuDTO(Long id, Double balance, Double extract, Double transfer, Long phonenumber, Long cpf,
			String password, LoginStatus login) {
		this.id = id;
		this.balance = balance;
		this.extract = extract;
		this.transfer = transfer;
		this.phonenumber = phonenumber;
		this.cpf = cpf;
		this.password = password;
		this.login = login;
	}
	
	public MenuDTO(Menu entity) {
		id = entity.getId();
		balance = entity.getBalance();
		extract = entity.getExtract();
		transfer = entity.getTransfer();
		phonenumber = entity.getPhonenumber();
		cpf = entity.getCpf();
		password = entity.getPassword();
		login = entity.getLogin();
		registers = entity.getRegisters().stream().map(x -> new RegisterDTO(x)).collect(Collectors.toList());

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getExtract() {
		return extract;
	}

	public void setExtract(Double extract) {
		this.extract = extract;
	}

	public Double getTransfer() {
		return transfer;
	}

	public void setTransfer(Double transfer) {
		this.transfer = transfer;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginStatus getLogin() {
		return login;
	}

	public void setLogin(LoginStatus login) {
		this.login = login;
	}

	public List<RegisterDTO> getRegisters() {
		return registers;
	}


	 
	
}
