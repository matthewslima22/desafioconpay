package com.desafioconpay.conpay.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.desafioconpay.conpay.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
	
	@Query("SELECT DISTINCT obj FROM Menu obj JOIN FETCH obj.registers "
			+"WHERE obj.login = 0 ORDER BY obj.cpf ASC")
	List<Menu> findMenuWithRegisters();

}
