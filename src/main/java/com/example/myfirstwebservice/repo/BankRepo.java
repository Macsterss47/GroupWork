package com.example.myfirstwebservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfirstwebservice.entity.Bank;

public interface BankRepo extends JpaRepository <Bank, Integer>{
	
}
