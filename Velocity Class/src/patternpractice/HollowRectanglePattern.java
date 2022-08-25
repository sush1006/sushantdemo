package patternpractice;

import java.util.Scanner;

public class HollowRectanglePattern {

	public static void main(String[] args) {
		
		int a,b;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of rows= ");
		a = obj.nextInt();
		System.out.print("Enter the number of columns= ");
		b = obj.nextInt();
		for (int i=1; i<=a; i++) {
			
			for (int j=1; j<=b; j++) {
				
				if(i==1 || j==1 || i==a || j==b) {
				System.out.print(" * ");
			}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
}
}
}