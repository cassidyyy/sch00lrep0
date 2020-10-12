public class AccountHolder {
	
	//string objects of accountholder class, and array account objects set to empty
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount[] checks = {};
	private SavingsAccount[] saves = {};
	private CDAccount[] cds = {};
	
	
	public AccountHolder() {
		
	//setting constructor methods string objects equal to empty strings!
		
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ssn = "";
		
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, 
			String ssn)  {
		
		//setting all variables equal to the parameter passed
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		
	}
	
    public String getFirstName() {
    	
    	//get first name
		
		return this.firstName;
		
	}
	

	public void setFirstName(String firstName) {
		
		//setting first name
		
		this.firstName = firstName;
		
	}
	
	public String getMiddleName() {
		
		//getting middle name
		
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		
		//setting middle name
		
		this.middleName = middleName;
	}

	public String getLastName() {
		
		//getting last name
		
		return this.lastName;
	}

	public void setLastName(String lastName) {
		
		//setting last name
		
		this.lastName = lastName;
	}

	public String getSsn() {
		
		//getting social security number
		
		return this.ssn;
	}

	public void setSsn(String ssn) {
		
		//setting social security number
		
		this.ssn = ssn;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		CheckingAccount check = new CheckingAccount(openingBalance);
		
		//object of checking account "check" , creates new checking account + opening balance
		
		CheckingAccount[] arr = new CheckingAccount[this.checks.length + 1];
		
		//array object of checking account "arr", creates new checks account array with the length parameter of checks accounts + 1 
		
		for(int i = 0; i < this.checks.length; i++) {
			
		// index of array is zero; index is less than length of checks accounts array; index++ > go through loop of array of checking accounts
			
			arr[i] = this.checks[i];
			
		//set array object index equal to checks accounts index 
			
		}
		arr[arr.length - 1] = check;
		
		//set array object length - 1 = check object
		
		this.checks = arr;
		
	   //this methods checks accounts = array object
		
		return check;
		
	   //return check object
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
		CheckingAccount check = checkingAccount;
		
	  //object of checking account "check" , creates new checking account
		
		CheckingAccount[] arr = new CheckingAccount[this.checks.length + 1];
		
	  //array object of checking account "arr", creates new checks account array with the length parameter of checks accounts + 1 
		
		for(int i = 0; i < this.checks.length; i++) {
			
	   // index of array is zero; index is less than length of checks accounts array; index++ > go through loop of array of checking accounts
			
			arr[i] = this.checks[i];
			
	  //set array object index equal to saves accounts index 
			
		}
		
		arr[arr.length - 1] = check;
		
	  //set array object length - 1 = check object
		
		this.checks = arr;
		
	  //this methods checks accounts = array object
		
		return check;
		
	  //return check object

		
	}
	
	
	public CheckingAccount[] getCheckingAccounts() {
	   
		return this.checks;
		
		//return this methods checks accounts
		
	}
	
	public int getNumberOfCheckingAccounts() {
		
		return this.checks.length;
		
		//return this methods checks accounts length of array
	}
	
	public double getCheckingBalance() {
		
		double temp = 0.0;
		
		//setting a temp value to go through loop starting at index
		
		for(int i = 0; i < this.checks.length; i++) {
			
		// index of array is zero; index is less than length of checkings accounts array, index++ > go through loop of array of checking accounts
	
			temp += checks[i].getBalance();
		
		// temp value += index of checking accounts + get balance of all checking accounts
			
		}
		
		return temp;
		
		// return temp value
		
	}
	
    public SavingsAccount addSavingsAccount(double openingBalance) {
		
		SavingsAccount save = new SavingsAccount(openingBalance);
		
		//object of savings account "save" , creates new savings account + opening balance
		
		SavingsAccount[] arr = new SavingsAccount[this.saves.length + 1];
		
		//array object of savings account "arr", creates new saves account array with the length parameter of saves accounts + 1 
		
		for(int i = 0; i < this.saves.length; i++) {
			
		// index of array is zero; index is less than length of saves accounts array, index++ > go through loop of array of saves accounts
			
			arr[i] = saves[i];
			
		//set array object index equal to saves accounts index 
		}
		
		arr[arr.length - 1] = save;
		
		//set array object length - 1 = save object
		
		this.saves = arr;
		
		//this methods saves accounts = array object
		
		return save;
		
		//return save object
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		
		SavingsAccount save = savingsAccount;
		
		//object of savings account "save" , creates new savings account
		
		SavingsAccount[] arr = new SavingsAccount[this.saves.length + 1];
		
		//array object of savings account "arr", creates new saves account array with the length parameter of saves accounts + 1 
		
		for(int i = 0; i < this.saves.length; i++) {
			
		//index of array is zero; index is less than length of saves accounts array, index++ > go through loop of array of saves accounts
			
			arr[i] = saves[i];
			
		//set array object index equal to saves accounts index 
			
		}
		
		arr[arr.length - 1] = save;
		
		//set array object length - 1 = save object
		
		this.saves = arr;
		
		//this methods saves accounts = array object
		
		return save;
		
		//return save object
	}
	
	
	public SavingsAccount[]  getSavingsAccounts() {
		
		return this.saves;
		
		//return this methods saves accounts
		

	}
	
    public int getNumberOfSavingsAccounts() {
		
		return this.saves.length;
		
		//return this methods saves accounts length of array
	}
	
	public double getSavingsBalance() {
		
         double temp = 0.0;
		
		//setting a temp value to go through loop starting at index
		
		for(int i = 0; i < this.saves.length; i++) {
			
		//index of array is zero; index is less than length of saves accounts array, index++ > go through loop of array of saves accounts
	
			temp += saves[i].getBalance();
		
		//temp value += index of saves accounts + get balance of all saves accounts
			
		}
		
		return temp;
		
		//return temp value
		
	}
	
   public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
		CDAccount cd = new CDAccount(offering, openingBalance);
		
	  //object of cds account "cd" , creates new cd account + offering & opening balance
		
		CDAccount[] arr = new CDAccount[this.cds.length + 1];
		
	  //array object of cd account "arr", creates new cd account array with the length parameter of cd accounts + 1 
		
		for(int i = 0; i < this.cds.length; i++) {
			
	  //index of array is zero; index is less than length of cd accounts array, index++ > go through loop of array of cd accounts
			
			arr[i] = cds[i];
			
	  //set array object index equal to cds accounts index 
			
		}
		
		arr[arr.length - 1] = cd;
		
	  //set array object length - 1 = cd object
		
	 
		this.cds = arr;
		
	  //this methods cds accounts = array object
		
		return cd;
		
      //return cd object
		
	}
   
   public CDAccount addCDAccount(CDAccount cdAccount) {
		
		CDAccount cd = cdAccount;
		
	  //object of cd account "cd" , creates new cd account
		
		CDAccount[] arr = new CDAccount[this.cds.length + 1];
		
	  //array object of cd account "arr", creates new cd account array with the length parameter of cd accounts + 1 
		
		for(int i = 0; i < this.cds.length; i++) {
			
	  //index of array is zero; index is less than length of cd accounts array, index++ > go through loop of array of cd accounts
			
			arr[i] = cds[i];
			
	  //set array object index equal to cds accounts index 
	}
		arr[arr.length - 1] = cd;
		
	  //set array object length - 1 = cd object
		
		this.cds = arr;
		
	  //this methods cds accounts = array object
		
		return cd;
		
	   //return cd object
	}
   
    public CDAccount[]  getCDAccounts() {
		
		return this.cds;
		
	  //return this methods cds accounts
		

	}
	
    public int getNumberOfCDAccounts() {
		
		return this.cds.length;
		
	  //return this methods cds accounts length of array
	}
	
	public double getCDBalance() {
		
        double temp = 0.0;
		
		//setting a temp value to go through loop starting at index
		
		for(int i = 0; i < this.cds.length; i++) {
			
		//index of array is zero; index is less than length of cds accounts array, index++ > go through loop of array of cds accounts
	
			temp += this.cds[i].getBalance();
		
		//temp value += index of cds accounts + get balance of all cds accounts
			
		}
		
		return temp;
		
		//return temp value
		
	}
	
	
	public double getCombinedBalance() {
		
        double temp = 0.0;
		
		//setting a double temp value to go through loop starting at index, he balance is a double data type
		
		for(int i = 0; i < this.saves.length + this.checks.length; i++) {
			
		//index of array is zero; , index++ > go through loop of array of saves + checks accounts
	
			temp += this.saves[i].getBalance() + this.checks[i].getBalance();
		
		//temp value += index of saves accounts + checks accounts index, get balance of combined accounts
			
		}
		
		return temp;
		
		//return temp value
		
		
		
	}
	
	
	public String toString() {
	   
	   StringBuilder accountHolder = new StringBuilder();
	   
	  //new string builder object to store account data within string builder object
	   
	   for(int i = 0; i < this.checks.length; i++) {
		   
		//index of array is zero; index is less than length of checks accounts array; index++ > go through loop of array of checking accounts
			 
			accountHolder.append(checks[i].getBalance());
			
			//adding checks index of get balance to account holder string object
			
			accountHolder.append(" ");
			accountHolder.append(checks[i].getInterestRate());
			
			//adding checks index of get interest rate to account holder string object
			
			accountHolder.append(" ");
			accountHolder.append(checks[i].futureValue(3));
			
			//adding checks index of get future value to account holder string object
			 
	    }
	   
	   for(int i = 0; i < this.saves.length; i++) {
		   
		 //index of array is zero; index is less than length of saves accounts array; index++ > go through loop of array of savings accounts
			 
			accountHolder.append(saves[i].getBalance());
			
			//adding saves index of get balance to account holder string object
			
			accountHolder.append(" ");
			accountHolder.append(saves[i].getInterestRate());
			
			//adding saves index of get interest rate to account holder string object
			
			accountHolder.append(" ");
			accountHolder.append(saves[i].futureValue(3));
			
			//adding checks index of get future value to account holder string object
			 
	    }
	   
	   for(int i = 0; i < this.cds.length; i++) {
		   
		   //index of array is zero; index is less than length of saves accounts array; index++ > go through loop of array of cd accounts
			 
			accountHolder.append(cds[i].getBalance());
			
			//adding cds index of get balance to account holder string object
			
			accountHolder.append(" ");
			accountHolder.append(cds[i].getInterestRate());
			
			//adding cds index of get interest rate to account holder string object
			 
	    }
	     
	  return accountHolder.toString();
	  
	  //return data account holder string builder object
		
	}
}
