public class remove extends ConsoleProgram{

	public static void main(String[] args) {
		String str = "This is a test";
		char ch = 't';
		
		System.out.println(removeAllOccurrences(str, ch));
	}
	
	public static String removeAllOccurrences(String str, char ch) {
		 String result = "";
		 for(int i = 0; i < str.length(); i++) {
			 if (str.charAt(i) != ch) {
				result = result + str.charAt(i);
			 }
		 }
		 return result;
	}

}

