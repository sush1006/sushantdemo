package programspractice;

import java.util.Scanner;

public class PrimeNumber {
	
 	public static void main(String[] args) {
 	
 		int n, count=0;
 		System.out.print("Enter the number=");
 		Scanner obj = new Scanner(System.in);
 		n = obj.nextInt();
 		
 		for (int i=1; i<=n; i++) {

 			if(n%i==0) {
 				count ++;
 			}
 	}
 		if(count==2)
				System.out.print("Entered number is prime number");
			else
				System.out.print("Entered number is not the prime number");
 	}
}
