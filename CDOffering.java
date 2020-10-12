public class CDOffering {
	
	private int term;
	private double interestRate;
	
	//variables of CDOffering

	
	public CDOffering() {
		
		this.term = 0;
		this.interestRate = 0;
		
	//setting all values to a default of zero
		
	}
	
	public CDOffering(int term, double interestRate) {
		
		this.term = term;
		this.interestRate = interestRate;
		
		//setting all variables equal to the parameter passed
		
		if (term == 1) {
			this.interestRate = 0.018;
		}
		if (term == 2) {
			this.interestRate = 0.019;
		}
		if (term == 3) {
			this.interestRate = 0.020;
		}
		if (term == 5) {
			this.interestRate = 0.025;
		}
		if (term == 10) {
			this.interestRate = 0.022;
		} 
		
		//if the year of cd offering is equal to number of years of proposed cd     offering, interest rate of cd offering object is equal to
		//this interest rate
		
	}
	
    public int getTerm() {
    	
    	//get term
    	
		return this.term;
	}
	
	public void setTerm(int term) {
		
		//set term
		
		this.term = term;
	}


    public double getInterestRate() {
    	
    	//get interest rate
    	
    	return this.interestRate;
    	
    }
    
    public void setInterestRate(double interestRate) {
    	
    	//set interest rate
    	
		this.interestRate = interestRate;
	}


}

