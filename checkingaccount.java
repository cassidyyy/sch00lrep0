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
    	return futureValue;
		
	}
  
	public String toString() {
		
		System.out.println(this.balance);
		System.out.println(this.interestRate);
		System.out.println(this.futureValue);
		
		
		String AccountHolder = "Checking Account Balance:" + this.balance + "\n Checking Account Interest Rate:" + this.interestRate + "\n Checking Account Balance in Three Years:" + this.futureValue;
	    
		return AccountHolder;
	
	}	 
	
}
