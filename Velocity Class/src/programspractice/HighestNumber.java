package programspractice;

import java.util.Scanner;

public class HighestNumber {

	public static void main (String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the three numbers= ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		
		if (a>b && a>c)
			System.out.println(a + " is highest number");
		
		else if (b>c && b>a)
			System.out.println(b + " is highest number");
		
		else
			System.out.println(c + " is highest number");
	}
}
