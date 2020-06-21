package com.simplilearn.exception;

import java.io.IOException;

public class ExThrowException {

	public static void main(String[] args) {
		
		// The throw keyword is used to throw custom exception
		// throw exception.
		ageValidator(23);
		System.out.println("Remaining code");

	}
	
	// take using facebook.
	
	public static void ageValidator(int age) {
		try {
			if(age>18) {
				System.out.println("Welcome to use facebook");
			}else {
				throw new IOException("Not a valid Age");
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}	
		
	}

}
