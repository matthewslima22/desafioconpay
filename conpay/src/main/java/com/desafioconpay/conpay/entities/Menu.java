package com.desafioconpay.conpay.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_menu")
public class Menu implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Double balance;
	private Double extract;
	private Double transfer;
	private Long phonenumber;
	private Long cpf;
	private String password;
	private LoginStatus login;
	
	@ManyToMany
	@JoinTable(name = "tb_menu_register",
		joinColumns = @JoinColumn(name = "menu_cpf"),
		inverseJoinColumns =  @JoinColumn(name = "register_cpf"))
	private Set<Register> registers = new HashSet<>();
	
	public Menu() {
		
	}

	public Menu(Long id, Double balance, Double extract, Double transfer, Long phonenumber, Long cpf,
			String password, LoginStatus login) {
		super();
		this.id = id;
		this.balance = balance;
		this.extract = extract;
		this.transfer = transfer;
		this.phonenumber = phonenumber;
		this.cpf = cpf;
		this.password = password;
		this.login = login;
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

	public Set<Register> getRegisters() {
		return registers;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

