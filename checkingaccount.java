package com.meritamerica.assignment1;

public class CheckingAccount {
	private double balance;
    private final double interestRate = .0001;
    private double futureValue;
    
    public CheckingAccount() {
    	
    	this.balance = 0;
		this.futureValue = 0;
    }
	
	
	public CheckingAccount(double openingBalance) {
		
		this.balance = openingBalance;
		
	}

    public double getBalance() {
    	
    	return this.balance;
 
		
	 }
	
 
   
    public double getInterestRate() {
	
	     return this.interestRate;
		
	}
   
    public boolean withdraw(double balance) {
       
    	if(balance <= this.balance) {
    	
    	this.balance = balance;
    	
    	return true;
    	
    	}
        
    	else return false;
     	
		
	}
   
    public boolean deposit(double balance) {
    	
    	if (balance < 0) {
    		
    		return false;
    	}
    	 
    	this.balance += balance;
    	
    	return true;
		
	}
	
    public double futureValue(int years) {
    	double PV = balance;
    	double futureValue = PV*(Math.pow((interestRate + 1), years));
    	this.futureValue = futureValue;
    	return futureValue;
		
	}
  
	public String toString() {
		
		
		String AccountHolder = String.format("Checking Account Balance: " + this.balance + "\nChecking Account Interest Rate: " + this.interestRate + "\nChecking Account Balance in Three Years: %.2f\n", futureValue(3));
	    
		return AccountHolder;
	
	}	 
	
}
