package programspractice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n, fact=1;
		System.out.print("Enter the number= ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for (int i= 1; i<=n; i++) {
			
			fact = fact * i;
		}
		System.out.println("Factorial of given number is " + fact);
	}

}
