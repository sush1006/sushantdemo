package patternpractice;

import java.util.Scanner;

public class SolidRectanglePattern {
	
	public static void main(String[] args) {
	
		int a,b;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of rows= ");
		a = obj.nextInt();
		System.out.print("Enter the number of columns= ");
		b = obj.nextInt();
		for (int i=1; i<=a; i++) {
			
		for (int j=1; j<=b; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	}
}
