package com.simplilearn.exception;

public class ExExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int num = 100;
			
			int res = num/ 0;   // arithmatic exception
			
			String st = null;
			st.length();   // null pointer exception.
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Statement after try-catch");

	}

}
