package truefalse;

public class tf {

	public static void main(String[] args) {
		// "The value of a local variable named i has no direct relationship with that of a variable named i in its caller." 
		int i = 1;

	}
	
	public static void dothis() {
		int i = 0;
	}
	
	// TRUE: not in the same class so the computer sees as two different parts of memory
	
	
	// "The value of a parameter named x has no direct relationship with that of a variable named x in its caller."
	
	public static void notthisagain(int x) {
		int x = 0;
	}

	// FALSE: They are apart of the same piece of memory
}
