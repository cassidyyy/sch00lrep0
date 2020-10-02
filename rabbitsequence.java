package fibsequence;

public class rabbitsequence {

	public static void main(String[] args) {
		System.out.println("This program lists the fibonachi sequence!");
		// declare the maximum value for the sequence	
		final int MAX_TERM_VALUE = 10000;
		// loop control variable 
		int term = 0;
		// first term number
		int f1 = 0;
		// print and format first term number
		System.out.print(f1 + ", ");
		// second term number
		int f2 = 1;
		// print and format second term number
		System.out.print(f2 + ", ");
		// variable of term is equal to the first plus the second term number
		term = f1 + f2;
		// loop conditional, term is less than max term value
		while (term < MAX_TERM_VALUE) {
			// print and format term
			System.out.print(term + ", ");
			// new value of f2 is equal to f2
			f1 = f2;
			// value of f2 equals the new  variable of term
			f2 = term;
			// variable of term is equal to the first plus the second term number
			term = f1 + f2;
		}

	}

}
