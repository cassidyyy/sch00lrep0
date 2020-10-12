public class CDAccount{
	
    private CDOffering cdo;
    private double balance;
    
    //variables of CDAccount
    
    public CDAccount() {
    
	    this.cdo = null;
	    this.balance = 0;
	    
    //setting all values to a default of zero
	    
    }
    
    public double getInterestRate() {
    	
    	
    //getting interest rate
    	
    	
      return cdo.getInterestRate();
      
      //return asking cdoffering what cdoffering's interest rate is because data is private
    	
    }
    
    public void setInterestRate(double rate) {
    	
      
    	//return setting what rate is for interest rate cdoffering what cdoffering's interest rate is because data is private
    	
    	cdo.setInterestRate(rate);
        
      	
      }

    
   public double getBalance() {
	   
	   //return this balance
	   
	   
	   return this.balance;
	   
   }

	
   public CDAccount(CDOffering offering, double balance) {	
	   
		//setting all variables equal to the parameter passed
	   
	   this.balance = balance;
	   this.cdo = offering;
		
  }
    
	public int getTerm() {
		
		//return asking cdoffering what cdoffering's term is because data is private
		
		return cdo.getTerm();
		
	}
    
    public void setTerm(int term) {
    	
    	//return setting what term is for cdofferings term is because data is private
    	
    	cdo.setTerm(term);
    }
    

	public java.util.Date getStartDate() {
		
		//return asking what java util date says account start date is
		
		return this.getStartDate();
	
	}
	
	
	public double futureValue() {
		
		//claiming a double future vale for cd accounts
		
		double futureValue = Math.pow(balance * (1 + cdo.getInterestRate() / 365),365 * cdo.getTerm());
		
		//future cd account value is equal to the balance of account to the power of the cdoffering interest rate + 1 to round precent
		//divided by the amount of days in a year a cdoffering incriments per day
		//multiplied by the amount of days in a year and the cdofferings term of years it has been open
		
		return futureValue;
		
		//return calculated future value of cd account
		
	}


}

