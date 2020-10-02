package tracingmethodexcution;

public class hogwarts {

	public static void main(String[] args) {
		
		/*
		 * File: Hogwarts.java
		 * -------------------
		 * This program is just testing your understanding of parameter passing.
		 */

			
		 public static void run() {
			 
		 bludger(2001);
		 
		 }
		 
		 private static void bludger(int y) {
		  
		 // bludger int y = 2001;
		 
	     int x = y / 1000;
	     
	     // 2001 / 1000 = 2;
	     
	     // x = 2;
		 
		 int z = (x + y);
		 
		 // 2001 + 2;
		 
		 // z = 2003;
		 
		 x = quaffle(z, y);
		 
		 // x = 1001
		 
		 // quaffle (z, 2001);
		
		 System.out.println("bludger: x = " + x + ", y = " + y + ", z = " + z);
		 
		 // bludger: x = 1001, y = 2001, z = 2003
		 
		 }
		 
		 private int quaffle(int x, int y) {
		
		// quaffle = (2003, 2001)
			 
	     int z = snitch(x + y, y);
	     
	    // z = snitch (4004, 2001)
		 
	     y /= z;
	     
	    // 2001 /= (1001);
	     
		 
	     System.out.println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
		 
	     return z;
	     
	     // z = 1001 y = 1, x = 2003
		 
		 }
		 
		 private int snitch(int x, int y) {
		 
	     y = x / (x % 10);
	     
	     // 4004 / 4004 % 10 
		 
	     System.out.println("snitch: x = " + x + ", y = " + y);
	     
	     // snitch: x = 4004 , y = 1001
		 
	     return y;
	     
	     // y = 1001
	     
		 
		 }
		 
	}
	
}




