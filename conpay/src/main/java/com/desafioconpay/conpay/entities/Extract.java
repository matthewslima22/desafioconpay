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
@Table(name = "tb_extract")
public class Extract implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Long cpf;
	private Double transfer;
	private Double balance;
	private Double recarga;
	
	@ManyToMany
	@JoinTable(name = "tb_extract_register",
		joinColumns = @JoinColumn(name = "extract_cpf"),
		inverseJoinColumns =  @JoinColumn(name = "register_cpf"))
	private Set<Register> registers = new HashSet<>();

	
	public Extract() {
		
	}

	public Extract(Long id, Double transfer, Double balance, Long cpf, Double recarga) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.transfer = transfer;
		this.balance = balance;
		this.recarga = recarga;
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

	public Double getTransfer() {
		return transfer;
	}

	public void setTransfer(Double transfer) {
		this.transfer = transfer;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getRecarga() {
		return recarga;
	}

	public void setRecarga(Double recarga) {
		this.recarga = recarga;
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
		Extract other = (Extract) obj;
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
