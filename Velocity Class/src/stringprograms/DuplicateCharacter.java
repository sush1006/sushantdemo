package stringprograms;

import java.util.Scanner;

public class DuplicateCharacter {

		public static void main(String[] args) {
		System.out.println("Enter the string: ");  
		Scanner obj = new Scanner(System.in);
		String S = obj.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			int idx = S.indexOf(ch, i+1); 
			if (idx==-1) {                // -1 means character not repeated in the string
				sb.append(ch);            // append method will add the data in string
			}
		}
		
		System.out.println(sb);
	}
}
