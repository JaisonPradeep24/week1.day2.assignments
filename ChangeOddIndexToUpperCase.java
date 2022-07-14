package week1.day2;

public class ChangeOddIndexToUpperCase {
	/*
	 * Pseudo Code
	 * 
	 * Declare String Input as Follow
	 * 
	 * String test = "changeme";
	 * 
	 * 
	 * 
	 * b) Traverse through each character (using loop)
	 * 
	 * c)find the odd index within the loop (use mod operator)
	 * 
	 * d)within the loop, change the character to uppercase, if the index is odd
	 * else don't change
	 * 
	 */

	public static void main(String[] args) {

		String test = "JaisonPradeepKumar";
		char[] cs = test.toCharArray();
		System.out.println("Length of the string is : " + cs.length);
		for (int i = 0; i <= cs.length - 1; i++) {

			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(cs[i]));
			} else {
				System.out.print(cs[i]);
			}

		}

	}

}
