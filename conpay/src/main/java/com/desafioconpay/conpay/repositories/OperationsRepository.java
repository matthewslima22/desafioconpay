package com.desafioconpay.conpay.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.desafioconpay.conpay.entities.Operations;


public interface OperationsRepository extends JpaRepository<Operations, Long> {
	
	@Query("SELECT DISTINCT obj FROM Operations obj JOIN FETCH obj.registers "
			+"ORDER BY obj.id ASC")
	List<Operations> findOperationsWithRegisters();

}
