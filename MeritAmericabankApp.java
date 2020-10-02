package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String args[]) {
		
		AccountHolder His = new AccountHolder("His", "name",  "is", "645789200", 100, 1000);
		
		System.out.println(His.toString());
		
		His.getCheckingAccount().deposit(500.00);
		
		System.out.println(His.getCheckingAccount().toString());
		
		His.getSavingsAccount().withdraw(800.00);
		
		System.out.println(His.getSavingsAccount().toString());
		
		AccountHolder Robert = new AccountHolder("Robert", "D", "Paulson", "778905439", 200, 500);
		
		Robert.getCheckingAccount().deposit(-500.00);
		
		Robert.getSavingsAccount().withdraw(800.00);
		
		System.out.println(Robert.toString());
		
		
		
		
		
		
	    
	}
	
}
