package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount check;
	private SavingsAccount save;
	
	
	public AccountHolder(){
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ssn = "";
		
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, 
			String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		check = new CheckingAccount(checkingAccountOpeningBalance);
		save = new SavingsAccount(savingsAccountOpeningBalance);
		
	}
	
	
	public CheckingAccount getCheckingAccount() {
	   
		return check;
		
	}
	
	
	public SavingsAccount  getSavingsAccount() {
		
		return save;

	}

	
	public String getFirstName() {
		
		return this.firstName;
	}
	

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
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
		
		System.out.println(this.check.getBalance());
		System.out.println(this.check.getInterestRate());
		this.check.futureValue(3);
		this.save.getBalance();
		this.save.getInterestRate();
		this.save.futureValue(3);
		
		
	   String AccountHolder = "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n SSN:" + this.ssn + "\n Checking Account Balance:" + this.check.getBalance() + "\n Checking Account Interest Rate:" + this.check.getInterestRate() + "\n Checking Account Balance in Three Years:" + this.check.futureValue(3) + "\n Savings Account Balance:" + this.save.getBalance() + "\n Savings Account Interest Rate:" + this.save.getInterestRate() + "\n Savings Account Balance in Three Years:" + this.save.futureValue(3);
	   
	   return AccountHolder;
		
	}
}
