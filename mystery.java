public class passingparameters {

	public static void main(String[] args) {
		
	}
		public void run() {
			
			ghost(13);
	 }
		private void ghost(int x) {
		  //ghost (int x 13);
			int y = 0;
		
		  for (int i = 1; i < x; i *= 2){
			  //int i = 1; 1 < 13; 2
		   y = witch(y, skeleton(x, i));
		   //1// y = witch(0, skeleton 1(13,1)) = 1
		  //2// y = witch (1, skeleton 0(13,2)) = 10
		  //3// y = witch (10, skeleton 1(13,4))= 101
		  //4// y = witch (101, skeleton 1(13, 8)) = 1001
	  }
		                          //  "ghost: x = 13, y = 1001;
		System.out.println("ghost: x = " + x + ", y = " + y);
	}
		                  //(0, 1)
		                  //(1, 0)
		                  //(10, 1)
		                 //(101, 1)
	  private int witch(int x, int y) {
	     x = 10 * x + y;
	   //x = 10 * 0 + 1;
	   //x = 10 * 1 + 0;
	   //x = 10 * 10 + 1
	   //x = 10 * 101 + 1;
		System.out.println("witch: x = " + x + ", y = " + y);
		                 // (witch x = 1 y = 1
		                 // (witch x = 10 y = 0
		return x;        // (witch x = 101 y = 1
	   //return 1;       // (witch x = 1001 y = 1
	  //return 10;
	  //return 101;
	  //return 1001;
	}
	                        // (13, 1)
	                       // (13, 2)
	                      // (13, 4)
	                     // (13, 8)
	  private int skeleton(int x, int y) {
		 return x / y % 2;
	//	 return 13 / 1 % 2 = 1
   //    return 13 / 2 % 2 = 0 
   //    return 13 / 4 % 2 = 1
  //     return 13 / 8 % 2 = 1 
		 
	  }
		

}

