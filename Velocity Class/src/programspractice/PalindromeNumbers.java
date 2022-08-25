package programspractice;

import java.util.Scanner;

public class PalindromeNumbers {
	
	public static void main(String[] args) {
				
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter starting number= ");
		int a = obj.nextInt();
		System.out.print("Enter last number= ");
		int b = obj.nextInt();
		System.out.println("Palindrome numbers in given range are: ");
		
		for (int i=a; i<=b; i++) {
			
			int n = i;
			int s = 0;
			
			while (n>0) {
				int r = n%10;
				s = (s*10) + r;
				n = n/10;
			}
			if (s==i) {
				System.out.print(i + " ");
			}
		}
	}

}
