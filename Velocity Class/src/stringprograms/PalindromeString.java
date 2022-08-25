package stringprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("Enter the String: ");
		Scanner obj = new Scanner(System.in);
		String S = obj.nextLine();
		String Rev = "";

		for (int i = S.length() - 1; i >= 0; i--)

			Rev = Rev + S.charAt(i);

		if (S.equals(Rev) == true)
			System.out.println("Given string is Palindrome.");
		else
			System.out.println("Given string is not Palindrome.");

	}

}
