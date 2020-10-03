package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount check;
	private SavingsAccount save;
	
	// kept private so that other classes cannot modify
	
	
	public AccountHolder() {
		
		// default constructor, setting all instances of variables to a default value
		
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ssn = "";
		
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, 
			String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)  {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		// setting this methods variables equal to the parameters of the class
		
		check = new CheckingAccount(checkingAccountOpeningBalance);
		save = new SavingsAccount(savingsAccountOpeningBalance);
		
		// creating a checking and savings account object > passing in the default parameter
		
	}
	
	
	public CheckingAccount getCheckingAccount() {
	   
		return check;
		
		// returns checking account value
		
	}
	
	
	public SavingsAccount  getSavingsAccount() {
		
		return save;
		
		// returns savings account value

	}

	
	public String getFirstName() {
		
		return this.firstName;
		
		// returns the value of this methods first name
	}
	

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
		//this methods first name == the parameter of first name
	}
	
	public String getMiddleName() {
		
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		
		
	   String AccountHolder = String.format("Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\nSSN: " + this.ssn + "\nChecking Account Balance: %.2f\nChecking Account Interest Rate: " + this.check.getInterestRate() + "\nChecking Account Balance in Three Years: %.2f\nSavings Account Balance: %.2f\nSavings Account Interest Rate: %.2f\nSavings Account Balance in Three Years: %.2f\n",this.check.getBalance(),this.check.futureValue(3), this.save.getBalance(), this.save.getInterestRate(), this.save.futureValue(3));
	   
	   return AccountHolder;
		
	}
}
