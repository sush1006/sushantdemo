package patternpractice;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
	
		int n;
		System.out.print("Enter the number for pattern= ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		
		// upper half
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++ ) {     //spaces
				System.out.print("   ");
			}
			
			for(int j=1; j<=2*i-1; j++) {    //stars
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		// lower half
				for(int i=n; i>=1; i--) {
					
					for(int j=1; j<=n-i; j++ ) {     //spaces
						System.out.print("   ");
					}
					
					for(int j=1; j<=2*i-1; j++) {    //stars
						System.out.print(" * ");
					}
					System.out.println();
				}
	}
}
