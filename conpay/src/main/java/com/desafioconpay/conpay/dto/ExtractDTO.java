package com.desafioconpay.conpay.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.desafioconpay.conpay.entities.Extract;


public class ExtractDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private Double balance = 100.00;
	private Double transfer;
	private Long cpf;
	private Double recarga;
	
	private List<RegisterDTO> registers = new ArrayList<>();
	
	public ExtractDTO() {
		
	}

	public ExtractDTO(Long id, Long cpf, Double balance, Double transfer, Double recarga) {
		this.id = id;
		this.cpf = cpf;
		this.balance = balance;
		this.transfer = transfer;
		this.recarga = recarga;

	}
	
	public ExtractDTO(Extract entity) {
		id = entity.getId();
		cpf = entity.getCpf();
		balance = entity.getBalance();
		transfer = entity.getTransfer();
		recarga = entity.getRecarga();
		registers = entity.getRegisters().stream().map(x -> new RegisterDTO(x)).collect(Collectors.toList());

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}



	public Double getTransfer() {
		return transfer;
	}

	public void setTransfer(Double transfer) {
		this.transfer = transfer;
	}

	public Double getRecarga() {
		return recarga;
	}

	public void setRecarga(Double recarga) {
		this.recarga = recarga;
	}


	public List<RegisterDTO> getRegisters() {
		return registers;
	}


	 
	
}
