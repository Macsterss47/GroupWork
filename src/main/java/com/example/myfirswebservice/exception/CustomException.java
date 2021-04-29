/**
 * This is Exception package of  myfirstwebservice.
 * */


package com.example.myfirswebservice.exception;

/**
 * CustomException class
 * */

public class CustomException extends Exception  {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * This customException is  incharge of error messages that being called.
	 *  
	 * 
	 * */
	public CustomException(String message) {
		super(message);
	}
}

