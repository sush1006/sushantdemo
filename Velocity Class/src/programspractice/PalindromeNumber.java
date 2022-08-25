package programspractice;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int n,c,r,pal=0;
		System.out.print("Enter the number= ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		c = n;
		
		while (n>0) {
			r = n%10;
			pal = (pal*10)+r;
			n = n/10;
		}
		if (c==pal)
			System.out.print("Entered number is Palindrome Number");
		else
			System.out.print("Entered number is not Palindrome Number");
	}

}
