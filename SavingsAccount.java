public class SavingsAccount extends BankAccount {
	
	//modifications made to checkings and savings accounts to extend the methods in bank account as an abstract class that inherits the functions of a bank account
	
	private double balance;
    private final double interestRate = .01;
    private double futureValue;
    
    //variables of savings account
    
    public SavingsAccount() {
    	
    	//setting all values to default of zero
    	
    	this.balance = 0;
		this.futureValue = 0;
    }
	
	
	public SavingsAccount(double openingBalance) {
		
		//setting all variables equal to the parameter passed
		
		this.balance = openingBalance;
		
	}

  
	
}
