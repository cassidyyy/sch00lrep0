package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private double balance;
    private final double interestRate = .01;
    private double futureValue;
    
    public SavingsAccount() {
    	
    	this.balance = 0;
		this.futureValue = 0;
    }
	
	
	public SavingsAccount(double openingBalance) {
		
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
    	return futureValue;
		
	}
  
	public String toString() {
		
		
		String AccountHolder = String.format("Savings Account Balance: " + this.balance + "\nSaving Account Interest Rate: " + this.interestRate + "\nSaving Account Balance in Three Years: %.2f\n", futureValue(3));
	    
		return AccountHolder;
		
	}
	
}
