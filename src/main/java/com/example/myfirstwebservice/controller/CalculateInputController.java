package com.example.myfirstwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.myfirstwebservice.service.CalculateService;
//Framework - Spring Framework (Spring Boot)

@RestController
@RequestMapping("/api")
public class CalculateInputController {
	
	@Autowired
	CalculateService service;
	
	//@Value("${custom.config.key}")
	float key;

	/*
	 * //http://localhost:8080/api/greet/Aris/Miranda
	 * 
	 * @GetMapping("/calculate/{name}/{lastname}") public String
	 * greetMePlease(@PathVariable("name") String name, @PathVariable("lastname")
	 * String lastname) { System.out.println("CUSTOM VALUE -> " + key); return
	 * service.viewGreeting(name + " " + lastname);
	 * 
	 * }
	 */

	
	@GetMapping("/calc")
	public String calculate(@RequestParam int j, @RequestParam int e, @RequestParam int s, @RequestParam int t) {		
		String result = "";
		try {
			result = "Your output is: " + service.calculate(j, e , s, t, key);
			
		} catch (Exception e2) {			
			
			result = "Something went wrong!!!! Check your inputs..";
			e2.printStackTrace();
		}
		
		return result;
	}
	
	
}
