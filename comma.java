import java.util.*;

import acm.program.*;

public class comma extends ConsoleProgram{

	public static void main(String[] args) {
		
	   while (true) {
		    System.out.print("Enter a numeric string: ");
		  	Scanner input = new Scanner (System.in);
		  	String digits = input.nextLine();
			   if (digits.length() == 0) break;
			 System.out.println(addCommasToNumericStringv2(digits));
			 
		}
	}

  
	
	private static String addCommasToNumericStringv2(String digits) {
		
		String result = "";
		int counter = 0;
		for(int i = digits.length() -1; i >= 0; i--) {
			result = digits.charAt(i) + result;
			counter++;
			if (counter % 3 == 0 && i > 0) {
				result = "," + result;
			}	  
		}

		return result;
		
	}
}



