package com.example.myfirstwebservice.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
	
	public Double calculate(int j, int e, int s, int t, float key) throws Exception{		
		double result = 0;
		
		try {
			if(j == 100) {
				throw new Exception("You cannot enter 100");
			}
			result = (j + e + s + t) * key;
		} catch (Exception e2) {
			throw e2;
		}
		
		return result;		
	}
}
