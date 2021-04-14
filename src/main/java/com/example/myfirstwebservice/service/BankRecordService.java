package com.example.myfirstwebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstwebservice.dao.BankDAOImpl;
import com.example.myfirstwebservice.entity.Bank;

@Service
public class BankRecordService {

	@Autowired
	BankDAOImpl bankDAOImpl;

	public Bank getBankInfo(int Id) throws Exception {		
		return bankDAOImpl.getBankInfo(Id);
	}

	// Create
	public Bank saveBankInfo(Bank bank) throws Exception {
		// persist means insert record into the table
		return bankDAOImpl.saveBankInfo(bank);
	}

	// Update
	public Bank updateBankInfo(Bank bank) {
		return bankDAOImpl.updateBankInfo(bank);
	}

	// Delete
	public String deleteBankInfo(int Id) {
		return bankDAOImpl.deleteBankInfo(Id);
	}
}
