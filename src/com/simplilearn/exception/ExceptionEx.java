package com.simplilearn.exception;

public class ExceptionEx {

	public static void main(String[] args) {
		
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		try {
			System.out.println("----------Inside try---------------");
			String s  = "";
			System.out.println(s.length());  // Null Pointer Exception
		} catch(Exception ex) {
			System.out.println("-------------------------");
			System.out.println("I am Exception Block");
			System.out.println("-------------------------");
		} finally {
			System.out.println("-------------------------");
			System.out.println("I am Finally Block");
			System.out.println("-------------------------");
		}
	
		System.out.println("Statement 4");
		System.out.println("Statement 5");
		System.out.println("Statement 6");
		
		
		

	}

}
