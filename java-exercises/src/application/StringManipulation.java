package application;

public class StringManipulation {

	// reverse a string
	// reverse a string using a foreach loop
	public static String reverseString(String input) {
		String output = "";
		for(char character : input.toCharArray()){
			output = character + output; 
		}	
		return output;
	}
	
	// reverse a string using an ascending loop
	public static String reverseStringTwo(String input){
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			output = input.charAt(i) + output;
		}
		return output;
	}
	
	// reverse a string using a descending loop
	public static String reverseStringThree(String input){
		String output = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			output +=  input.charAt(i);
		}
		return output;
	}

	// reverse a string using a StringBuilder
	public static String reverseStringFour(String input){
		StringBuilder output = new StringBuilder(input).reverse();
		return output.toString();
	}
	
}
