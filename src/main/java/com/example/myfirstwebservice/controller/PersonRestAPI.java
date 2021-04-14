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
import com.example.myfirstwebservice.entity.Person;
import com.example.myfirstwebservice.service.BankRecordService;
import com.example.myfirstwebservice.service.PersonRecordService;

import execption.CustomException;

@RestController
@RequestMapping("/record")
public class PersonRestAPI {
	
	

	
	@Autowired	
	PersonRecordService service;
	

	///http://localhost:8080/record/person/id
	@GetMapping("/person/{id}")
	public Person getPersonInfo(@PathVariable("id") int id) throws Exception {
		Person person =service.getPersonInfo(id);
		
		return person;	
	}
	
		
	

		@PostMapping("/person")	
		public Person savePersonInfo(@RequestBody Person person) throws Exception {
			return service.savePersonInfo(person);
				
		} 
		
		//http://localhost:8080/record/person/
	@PutMapping("/person")	
	public Person updatePersonInfo(@RequestBody Person person) throws Exception {
		return service.updatePersonInfo(person);
	} //comment
	
	//http://localhost:8080/record/person?id={person.id}
	@DeleteMapping("/person")	
	public String deletePersonInfo(@RequestParam int id){
		return service.deletePersonInfo(id);
	} 
	
}
