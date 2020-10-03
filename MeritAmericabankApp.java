package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String args[]) {
		
		AccountHolder Matt = new AccountHolder("Matt", "K",  "Stone", "645789200", 100, 1000);
		
		System.out.print(Matt.toString());
		
		Matt.getCheckingAccount().deposit(500.00);
		
		System.out.print(Matt.getCheckingAccount().toString());
		
		Matt.getSavingsAccount().withdraw(800.00);
		
		System.out.print(Matt.getSavingsAccount().toString());
		
		AccountHolder Trey = new AccountHolder("Trey", "D", "Parker", "778905439", 200, 500);
		
		Trey.getCheckingAccount().deposit(-500.00);
		
		Trey.getSavingsAccount().withdraw(800.00);
		
		System.out.print(Trey.toString());
		
		
		
		
		
		
		
	    
	}
	
}
