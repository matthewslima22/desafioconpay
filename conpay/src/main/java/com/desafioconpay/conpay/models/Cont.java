package com.desafioconpay.conpay.models;


public class Cont {
	private String name;
	private Double balance = 100.00;
	private Long cpf;
	
	public Cont() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String transfer(Double valor) {
		if(valor<balance){
			balance = balance - valor;
			return "Tranferencia realizada";
			
		}else {
			return "Saldo insuficiente ";
		}
	}
	public String recarga(Double valor) {
		if(valor<balance){
			balance = balance - valor;
			return "Recarga realizada";
			
		}else {
			return "Saldo insuficiente ";
		}
	}
 }
