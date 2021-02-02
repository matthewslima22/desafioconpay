package com.desafioconpay.conpay.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.desafioconpay.conpay.entities.Extract;


public interface ExtractRepository extends JpaRepository<Extract, Long> {
	
	@Query("SELECT DISTINCT obj FROM Extract obj JOIN FETCH obj.registers "
			+"ORDER BY obj.id ASC")
	List<Extract> findExtractWithRegisters();

}
