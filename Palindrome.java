package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */

		String str = "MADAM";
		int length = str.length();
		String rev = "";

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) {

			System.out.println("Yes the given string is a Palindrome : " + rev);

		} else {
			System.out.println("Not palindrome");
		}

	}

}
