package stringprograms;

import java.util.Scanner;

public class ReverseSequence {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner obj = new Scanner(System.in);
		String S = obj.nextLine();
		
		String[] words = S.split("\\s");
		
		for(int i=words.length-1; i>=0; i--)
			System.out.print(words[i]+ " ");
	}
}

