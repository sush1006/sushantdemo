package programspractice;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int n,rem;
		System.out.print("Enter the number=");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		System.out.print("The reverse number=");
		while(n>0) {
			
			rem = n%10;
			System.out.print(rem);
			n = n/10;
		}
	}

}
