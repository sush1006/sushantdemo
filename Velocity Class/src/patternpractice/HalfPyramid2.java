package patternpractice;

import java.util.Scanner;

public class HalfPyramid2 {
public static void main(String[] args) {
		
		int a;
		System.out.print("Enter the number of rows= ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		
		for (int i=a; i>=1; i--) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
