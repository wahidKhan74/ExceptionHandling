package com.simplilearn.exception;

import java.util.ArrayList;
import java.util.List;

class Account {
	public int accNo;
	public String name;
	public double balance;
	Account(){};
	
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
}

public class BankOpr {
	
	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(102,"John",20993.00));
		accounts.add(new Account(103,"Will",60993.00));
		accounts.add(new Account(104,"Mike",30993.00));
		accounts.add(new Account(105,"Sam",80993.00));
		
//		BankOpr.showBalance(accounts, 104);
		BankOpr.depositAmt(accounts, 104, 1000);
	}
	
	public static void showBalance(List<Account> accounts,int accountNo) {
		try {
			for(Account acc : accounts) {
				if(acc.accNo ==accountNo ) {
					System.out.println("The account " + accountNo+" Balance is :" +acc.balance);
					
				}
			}
			int re = (int) (accountNo / 0);  // Arithmatic Exception
		} catch(Exception e) {
			System.out.println("Fail to load account balance for "+accountNo);
		}
		System.out.println("End of show balance");
	}
	
	
	public static void depositAmt(List<Account> accounts,int accountNo, double amount) {
		try {
			for(Account acc : accounts) {
				if(acc.accNo ==accountNo ) {
					System.out.println("The account " + accountNo+" Balance is :" +acc.balance);
					//deposit amount
					acc.balance = acc.balance + amount;
					System.out.println("The account " + accountNo+" New Balance is :" +acc.balance);
				}
			}
			
		} catch(Exception e) {
			System.out.println("Fail to deposit amount in  "+accountNo);
		}
		System.out.println("End of Deposit balance");
	}
	
	// withdraw operation

}









