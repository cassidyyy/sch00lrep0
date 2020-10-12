public class MeritBank {
	
	//variables of accountholder class, and array account objects set to empty
	
	private static long accountNumber = 0;
	private static AccountHolder[] accounts = {};
	private static CDOffering[] cdOs = {};
	
	
      public static void addAccountHolder(AccountHolder accountHolder) {
	   
    	  AccountHolder account = accountHolder;
    	  
    	  //object of account holder account "account" , creates new account holder object
    	  
    	  AccountHolder[] arr = new AccountHolder[accounts.length + 1];
    	  
    	  //array object of checking account "arr", creates new checks account holder with the length parameter of accounts accounts + 1 
    	  
    	  for(int i = 0; i < accounts.length; i++) {
    		  
     // index of array is zero; index is less than length of accounts array; index++ > go through loop of array of account holders
    		  
    		  arr[i] = accounts[i];
    		  
    		  //set array object index equal to accounts index 
    		  
    		  arr[arr.length - 1] = account;
    		  
    		  //set array object length - 1 = account object
    		  
    		  accounts = arr;
    		  
    		  //this methods accounts = array object
    		  
    		  //void does not require return type
    	  }
      }
  
      public static AccountHolder[] getAccountHolders() {
    	  
    	  return accounts;
    	  
    	  //return accounts array object
	  
  
      }
      
      public static CDOffering[] getCDOfferings() {
    	  
    	  return cdOs;
    	  
    	  //return cdofferings array object
	  
  
      }
      
      public static CDOffering getBestCDOffering(double depositAmount) {
    	  
    	  double temp = 0.0;
    	  
    	  //create empty temp value for comparing interest values
    	  
    	  double best = 0.0;
    	  
    	  //best value is set to nothing
    	  
    	  CDOffering bestCD = new CDOffering();
    	  
    	//CDOffering object "bestCD" set to a new instance of CDOffering
    	 
    	 temp = Math.pow(depositAmount * (1 + 0.018 / 365),365 *1);
    	 
    	 //set temp value equal to the deposit amount parameter of the CDOffering
    	 //multiplied by the interest rate of the CDOffering + 1 for rounding divied by the amount of days in the year that the CD offering
    	 //will increment each day, to the power of the amount of days in the year the CDOffering will increment, multipled by the term of the 
    	 //CD offerings
    	  
    	  if (temp > best) {
    	
    	  //compares best to temp, if temp is greater than the value of best
    		  
    		  best = temp; 
    		  
    	  //set best equal to the value of temp to compare interest rates and values	  
    		  bestCD.setInterestRate(0.018);
    	  //go through set interest rate of potential best CD offerings, passing the interest rate of CDOffering as parameter
    		  bestCD.setTerm(1);
    	 //go through set term of potential best CDOfferings, passing the amount of the CDOffering term as a parameter
    	  
    	  }
    	  
    	  temp = Math.pow(depositAmount * (1 + 0.019 / 365),365 *2);
    	  
         if (temp > best) {
    		  
    		  best = temp;
    		  bestCD.setInterestRate(0.019);
    		  bestCD.setTerm(2);
    	  }
    	  
         temp = Math.pow(depositAmount * (1 + 0.020 / 365),365 *3);
         
         if (temp > best) {
   		  
   		  best = temp;
   		  bestCD.setInterestRate(0.020);
		  bestCD.setTerm(3);
   	    
         }
         
         temp = Math.pow(depositAmount * (1 + 0.025 / 365),365 *5);
         
         if (temp > best) {
      		  
      		  best = temp;
      		  bestCD.setInterestRate(0.025);
  		      bestCD.setTerm(5);
      	    
            }
         
         temp = Math.pow(depositAmount * (1 + 0.022 / 365),365 *10);
    	
         if (temp > best) {
     		  
     		  best = temp;
     		  bestCD.setInterestRate(0.022);
 		      bestCD.setTerm(10);
     	    
           }
         
         
         return bestCD;
         
         //return object of bestCD (offering)
  
      }
  
      public static CDOffering getSecondBestCDOffering(double depositAmount) {
    	  
    	 double temp = 0.0;
    	 
    	 //create empty temp value for comparing interest values
    	 
    	 double best = 0.0;
    	 
    	 //best value is set to nothing
    	 
    	 double secondBest = 0.0;
    	 
    	 //second best value is set to nothing
    	 
    	CDOffering bestCD = new CDOffering(); 
    	
    	//CDOffering object "bestCD" set to a new instance of CDOffering
	    
    	CDOffering secondBestCD = new CDOffering();
    	
    	//CDOffering object "secondbestCD" set to a new instance of CDOffering
    	
    	temp = Math.pow(depositAmount * (1 + 0.018 / 365),365 *1);
    	
    	 //set temp value equal to the deposit amount parameter of the CDOffering
   	    //multiplied by the interest rate of the CDOffering + 1 for rounding divied by the amount of days in the year that the CD offering
   	   //will increment each day, to the power of the amount of days in the year the CDOffering will increment, multipled by the term of the 
   	   //CD offerings
  	  
  	  if (temp > best) {
  		  
  		 //compares best to temp, if temp is greater than the value of best
  		
  		best = temp;  
  	  //set best equal to the value of temp to compare interest rates and values
  		bestCD.setInterestRate(0.018);	
     //go through set interest rate of potential best CD offerings, passing the interest rate of CDOffering as parameter
		bestCD.setTerm(1);
	  //go through set term of potential best CDOfferings, passing the amount of the CDOffering term as a parameter
  		  
  	  } else if (temp < best && temp > secondBest) {
  		//exception for if temp is less than best AND temp is greater than second best
  		  
  		  secondBest = temp;
  		  
  		 //set secondBest equal to the value of temp to compare interest rates and values
  		  secondBestCD.setInterestRate(0.018);
  		 //go through set interest rate of potential secondBest CD offerings, passing the interest rate of CDOffering as parameter
  		  secondBestCD.setTerm(1);
  		 //go through set term of potential secondBest CD offerings, passing the term of CDOffering as parameter
  	  }
  	  
  	  temp = Math.pow(depositAmount * (1 + 0.019 / 365),365 *2);
  	  
       if (temp > best) {
    	   
    	   best = temp;
    	   bestCD.setInterestRate(0.019);
   		   bestCD.setTerm(2);
     	 
  		  
       } else if (temp < best && temp > secondBest) {
      		  
    	    secondBest = temp;
      		secondBestCD.setInterestRate(0.019);
      		secondBestCD.setTerm(2);
  	  }
  	  
       temp = Math.pow(depositAmount * (1 + 0.020 / 365),365 *3);
       
       if (temp > best) {
    	   
    	   secondBest = temp;
    	   bestCD.setInterestRate(0.020);
   		   bestCD.setTerm(3);
 	    
       } else if (temp < best && temp > secondBest) {
   		  
    	   
    	    secondBest = temp;   		   
    	    secondBestCD.setInterestRate(0.019);
   		    secondBestCD.setTerm(2);
	  }
       
       temp = Math.pow(depositAmount * (1 + 0.025 / 365),365 *5);
       
       if (temp > best) {
    	   
    	   best = temp;
    	   bestCD.setInterestRate(0.020);
   		   bestCD.setTerm(5);
    		  
    	    
       } else if (temp < best && temp > secondBest) {
    		
    	    secondBest = temp;  
  		    secondBestCD.setInterestRate(0.020);
  		    secondBestCD.setTerm(5);
	  }
       
        temp = Math.pow(depositAmount * (1 + 0.022 / 365),365 *10);
        
        if (temp > best) {
     	   
           best = temp;
     	   bestCD.setInterestRate(0.022);
    	   bestCD.setTerm(10);
     		  
     	    
       } else if (temp < best && temp > secondBest) {
     		
    	    secondBest = temp;
   		    secondBestCD.setInterestRate(0.022);
   		    secondBestCD.setTerm(10);
   		    
       }
    	
    	return secondBestCD;
    	 
  
       }
  
      public static void clearCDOfferings() {
	  
    	  for (int i = 0; i < cdOs.length; i++) {
    		  
    		// index of array is zero; index is less than length of cd offerings array; index++ > go through loop of array of cd offerings
    		   
    		  cdOs[i] = null;
    		  
    		  //cd offerings array index equals nothing
    	  }
  
      }
  
      public void setCDOfferings(CDOffering[] offerings) {
    	  
    	  cdOs = offerings;
    	  
    	  //cdofferings array object is equal to the parameter of offerings
	  
  
      }
  
      public static long getNextAccountNumber() {
    	  
    	  //go to next account number;
    	  
    	  accountNumber++;
	      
    	  return accountNumber;
    	  
    	  //return account number object
  
      }
  
      public static double totalBalances() {
    	  
    	  double temp = 0.0;
    	  
    	  //temp value is equal to zero
    	  
    	  for(int i = 0; i < accounts.length; i++) {
    		  
       // index of array is zero; index is less than length of accounts array; index++ > go through loop of array of account holders
    		  
    		temp += accounts[i].getCDBalance();
    		
    		//add the accounts length index or array object of cdbalances into the temp value
    		  
    	  }
    	  
    	  return temp;
    	  
    	  //return temp value
	  
  
      }
  
      public static double futureValue(double presentValue, double interestRate, int term) {
    	  
    		//future value is equal to present value to the power of account interest rate + 1 to round, times to amount to years the account has been open
  		  
    	  double futureValue = presentValue*(Math.pow((interestRate + 1), term));
    	  
    	   //return future value amount
      	  
  		  return futureValue;
  
      }



}

