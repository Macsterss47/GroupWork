package com.example.myfirstwebservice.dao;


import java.util.NoSuchElementException;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.myfirstwebservice.controller.MessageType;
import com.example.myfirstwebservice.entity.Bank;
import com.example.myfirstwebservice.entity.Person;
import com.example.myfirstwebservice.repo.BankRepo;
import com.example.myfirstwebservice.repo.PersonRepo;
import com.example.myfirstwebservice.service.PersonRecordService;

import execption.CustomException;

@Repository
@Transactional
public class PersonDAOImpl {

	//Perform SQL operation under this class
	
	@Autowired   //widely used for Dependency Injection
	PersonRepo personRepo;
	
	@Autowired
	BankRepo bankRepo;
	
	//Read
	public Person getPersonInfo(int id) throws Exception {
Optional<Person> person = personRepo.findById(id);
	
		if(person.isEmpty()) {
			throw new CustomException(MessageType.RECORD_NOT_FOUND.getCode());
		}
		
		return person.get();
				
	
	}
	
	

//Create
	public Person savePersonInfo(Person person)throws Exception {
	Optional<Person> personOPT = personRepo.findById(person.getId());
	if(personOPT.isPresent()) {
		throw new CustomException(MessageType.RECORD_EXIST.getCode());
	}
	//persist means insert record into the table
	return personRepo.save(person);
	
}

//Update
	public Person updatePersonInfo(Person person) throws Exception {
		Optional<Person> personOPT = personRepo.findById(person.getId());
		if(personOPT.isEmpty()) {
			throw new CustomException(MessageType.UPDATE_ONLY.getCode());
		}
		
		return personRepo.saveAndFlush(person);
	  
	}
	//Delete
	public String deletePersonInfo(int id) {
		Person person = null;
		String message = "";
		
		try {
			person = getPersonInfo(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		if(person != null) {
			personRepo.delete(person);
			message = "Deleted successfully.";
		}else {
			message = "Unsuccessful deletion.";
		}
		return message;
	}	
}
