package com.example.myfirstwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstwebservice.entity.Bank;
import com.example.myfirstwebservice.service.BankRecordService;

@RestController
@RequestMapping("/bankrecord")
public class BankRestAPI {

	@Autowired
	BankRecordService bservice;

	/// http://localhost:8080/bankrecord/bank/id
	@GetMapping("/bank/{id}")
	public Bank getBankInfo(@PathVariable("id") int id) throws Exception {
		Bank bank = bservice.getBankInfo(id);
		return bank;
	}

	// insert record into the table
	@PostMapping("/bank")
	public Bank saveBankInfo(@RequestBody Bank bank) throws Exception {
		return bservice.saveBankInfo(bank);
	}
	
	//update record in to the table
	@PutMapping("/bank")
	public Bank updateBankInfo(@RequestBody Bank bank) {
		return bservice.updateBankInfo(bank);
	}

	// http://localhost:8080/bankrecord/bank?id={bank.id}
	@DeleteMapping("/bank")
	public String deleteBankInfo(@RequestParam int id) {
		return bservice.deleteBankInfo(id);
	}
}