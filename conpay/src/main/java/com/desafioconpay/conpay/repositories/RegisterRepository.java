package com.desafioconpay.conpay.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafioconpay.conpay.entities.Register;

public interface RegisterRepository extends JpaRepository<Register, Long> {

	List<Register> findAllByOrderByNameAsc();
}
