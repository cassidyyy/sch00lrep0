public abstract class BankAccount {
	
	//cannot create an object from this class in abstract with qualities and variables of a 'bank account'
	//bank account is not concrete but savings, checking, and CD account exist as concrete
	
	private double balance;
	private double interestRate;
	private long accountNumber;
	private double futureValue;
	
	//variables of bank account
	
	BankAccount() {
		
	//setting all values to default of zero
		
		balance = 0;
		interestRate = 0;
		accountNumber = 0;
		futureValue = 0;
	}
	
	BankAccount(double balance, double interestRate) {
		
		//setting all variables equal to the parameter passed
		
	   this.balance = balance;
	   
	   this.interestRate = interestRate;
		
	}
	
	BankAccount(long accountNumber, double balance, double interestRate) {
		
		//setting all variables equal to the parameter passed
		
		this.accountNumber = accountNumber;
		
		this.accountNumber = accountNumber;
		
	}
	
	public long getAccountNumber() {
		
		//get account number
		
		return this.accountNumber;
		
	}
	
	public void setAccountNumber(long accountNumber) {
		
		//set account number
		
		this.accountNumber = accountNumber;
	}

	
	public double getBalance() {
		
		//get balance
		
		return this.balance;
		
	}
	
	public void setBalance(double balance) {
		
		//setting balance
		
		this.balance = balance;
	}
	
	public double getInterestRate() {
		
		//getting interest rate
		
		return this.interestRate;
		
	}
	
	public void setInterestRate(double interestRate) {
		
		//setting interest rate
		
		this.interestRate = interestRate;
	}
	
	public boolean withdraw(double amount) {
		
		//by calling savings or checking bankaccount.withdrawl will use the withdraw method from abstract parent class without needing it in children 
		//(savings, checking) 
		
		if(this.balance >= amount) {
			
		//if the accounts balance is greater than or equal to amount
	    	
	    this.balance = balance - amount;
	    
	    //account balance equals the current balance minus withdraw amount
	    	
	    return true;
	    
	    	
	    	}
	        
	    	else return false;
	    
		
	}
	
	public boolean deposit (double amount) {
		
		//by calling savings or checking bankaccount.deposit will use the withdraw method from abstract parent class without needing it in children 
		//(savings, checking) 
		
          if (balance < 0 || balance  + amount > 250000) {
        	  
         //if balance is negative or balance + deposit is greater than 250000
    		
    		return false;
    	 }
    	 
    	 this.balance += amount;
    	 
    	 //account balance equals current balance plus deposited amount
    	
    	 return true;
		
	}
	
	
	public double getFuturevalue() {
		
		//get future value
		
		return futureValue;
	}

	public void setFuturevalue(double futurevalue) {
		
		//setting future value
		
		this.futureValue = futurevalue;
	}

	public double futureValue(int years) {
		
		//present value equals balance of account
		
		double PV = balance;
		
		//future value is equal to present value to the power of account interest rate + 1 to round, times to amount to years the account has been open
		
		double futureValue = PV*(Math.pow((interestRate + 1), years));
		
		//return future value amount
		
    	return futureValue;
	}
	
       public String toString() {
    	   
    	   
    	 StringBuilder bankAccount = new StringBuilder();
    	 
    	  //new string builder object to store bank account data within string builder object
    	 
		 bankAccount.append(this.accountNumber);
		 bankAccount.append(" ");
		 
		 //add account number to string builder object
		 
		 bankAccount.append(this.balance);
		 bankAccount.append(" ");
		 
		 //add balance to string builder object
		 
		 bankAccount.append(this.interestRate);
		 bankAccount.append(" ");
		 
		 //add interest rate to string builder object
		 
		 bankAccount.append(this.futureValue(3));
		 bankAccount.append("\n");
		 
		 //add future value to string builder object
		
	    
		return bankAccount.toString();
		
		//return bank account data to string builder object
		
	}


}

