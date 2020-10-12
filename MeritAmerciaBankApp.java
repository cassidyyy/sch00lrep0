public class MeritAmericaBankApp {
	
	public static void main(String args[]) {
		
		CDOffering CD1 = new CDOffering(1, 0.018);
		CDOffering CD2 = new CDOffering(2, 0.019);
		CDOffering CD3 = new CDOffering(3, 0.020);
		CDOffering CD4 = new CDOffering(5, 0.025);
		CDOffering CD5 = new CDOffering(10, 0.022);
		
		///creates five new CDOffering objects
		
		System.out.println("Five new CD Offerings have been added to Merit Bank.");
		
		System.out.println(" ");
		
		AccountHolder ah1 = new AccountHolder("Matt", "K",  "Stone", "645789200");
		
		//creates new account holder object with string parameters as argument
		
		System.out.print(ah1.toString());
		
		//prints account holder object to string
		
		ah1.addCheckingAccount(1000);
		
		ah1.addSavingsAccount(10000);
		
		ah1.addCheckingAccount(5000);
		
		ah1.addSavingsAccount(50000);
		
		ah1.addCheckingAccount(50000);
		
		ah1.addSavingsAccount(500000);
		
		ah1.addCheckingAccount(5000);
		
		ah1.addSavingsAccount(50000);
		
		//adds savings and checking accounts to account holder object with opening  balances as parameters
		
		System.out.println(" ");
		
		//
		
        for(int i = 0; i < ah1.getCheckingAccounts().length + ah1.getSavingsAccounts().length; i++) {
        	
       //index of array is zero; index is less than length of accountholder's checkings + account holder's savings accounts array; index++ > go through loop of array of checking and savings accounts
			
		    System.out.println(ah1.getCheckingAccounts()[i]);
		    
		  //prints account holder's checking accounts array index
		    
		    System.out.println(" ");
		    System.out.println(ah1.getSavingsAccounts()[i]);
		    
		  //prints account holder's savings accounts array index
		    
        }
        
        System.out.println(" ");
		
		System.out.print("Cannot make last two accounts for Matt Stone. Combined balances exceed 250000");
		
		//verifies that the last two accounts for object cannot pass requirements
		
		System.out.println(" ");
		
		MeritBank.getBestCDOffering(100);
		
		//gives best CD offering with opening balance as argument to account holder one
		
		System.out.println("Best CD Offering has been added to Matt Stone's Account.");
		
		System.out.println(" ");
			
		MeritBank.addAccountHolder(ah1);
		
		//adds account holder object to merit banks account holders
		
		System.out.println("Matt Stone has been added to Merit Bank's list of Account Holders.");
		
		System.out.println(" ");
		
		AccountHolder ah2 = new AccountHolder("Trey", "D", "Parker", "778905439");
		
		System.out.print(ah2.toString());
		
		System.out.println(" ");
		
        ah2.addCheckingAccount(1000);
		
		ah2.addSavingsAccount(10000);
		
		 for(int i = 0; i < ah2.getCheckingAccounts().length + ah2.getSavingsAccounts().length; i++) {
				
			    System.out.println(ah2.getCheckingAccounts()[i]);
			    System.out.println(" ");
			    System.out.println(ah2.getSavingsAccounts()[i]);
			    
	        }
		 
			System.out.println(" ");
			
			MeritBank.getSecondBestCDOffering(100);
			
			System.out.println("Second Best CD Offering has been added to Trey Parker's Account.");
			
			System.out.println(" ");
			
			System.out.println("Trey Parker has been added to Merit Bank's list of Account Holders.");
			
			System.out.println(" ");
			
		MeritBank.clearCDOfferings();
		
		System.out.println("CD Offerings have been cleared for Merit Bank.");
		
		System.out.println(" ");
		
		AccountHolder ah3 = new AccountHolder("Melissa", "C", "Vanlez", "900564311");
		
		System.out.print(ah3.toString());
		
		System.out.println(" ");
		
        MeritBank.getSecondBestCDOffering(100);
		
		System.out.println("Second Best CD Offering has been added to Melissa Valez's Account.");
		
		System.out.println(" ");
		
		System.out.print("A CD Account was not created for Melissa C Valenz");
		
		System.out.println(" ");
		
		ah3.addCheckingAccount(1000);
		
		ah3.addSavingsAccount(10000);
		
		for(int i = 0; i < ah3.getCheckingAccounts().length + ah3.getSavingsAccounts().length; i++) {
			
		    System.out.println(ah3.getCheckingAccounts()[i]);
		    System.out.println(" ");
		    System.out.println(ah3.getSavingsAccounts()[i]);
		    
        }
		
		System.out.println(" ");
		
		System.out.println("Melissa Valez has been added to Merit Bank's list of Account Holders.");
		
		System.out.println(" ");
		
		double total = 0;
		
		//temporary double value for account holder balances is set to zero
		
		 for(int i = 0; i < MeritBank.getAccountHolders().length; i++) {
			 
  //index of array is zero; index is less than length of Merit Banks accountholders array; index++ > go through loop of array of checking and savings accounts
			 
			 total += MeritBank.getAccountHolders()[i].getCombinedBalance();
			 
			 //add the length of index of account holders combined balance into the value of total
			
			 System.out.println(total);
			 
			 //print total value of combined balances
   	       }
		
		}
		
	    
	}
	

