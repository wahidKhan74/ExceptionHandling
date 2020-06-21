package com.simplilearn.exception;

import java.util.ArrayList;
import java.util.List;

public class UserNotFoundEx {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Mike");
		list.add("Sam");
		list.add("David");
		list.add("Miller");
		
		try {
			int found = 0; 
			for(String u : list) {
				if(u.equals("Ravi")) {
					System.out.println("User Found");
					found = found +1;
				}
			}
			if(found== 0) {
				throw new Exception("User Not Found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}
	
}
