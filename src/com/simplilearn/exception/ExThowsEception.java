package com.simplilearn.exception;

import java.io.IOException;

public class ExThowsEception {

	public static void main(String[] args){
		// Throws : is used to declare exception
		// alert to programmer that there may changes of occurring error.
		
		try {
			
			try {
				sample();
			} catch (Exception e) {
				throw e;  // re throwing
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("After try and catch");
	}
	
	public static void sample() throws IOException{
		throw new IOException();
	}
}
