package programspractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n,c, arm=0, rem;
		System.out.print("Enter the number= ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		c = n;
		while (n>0) {
			
			rem = n%10;
			arm = (rem * rem* rem)+arm;
			n = n/10;
		}
		
		if(c==arm)
			System.out.print("Entered number is Armstrong Number");
		else
			System.out.print("Entered number is not Armstrong Number");
	}
}
