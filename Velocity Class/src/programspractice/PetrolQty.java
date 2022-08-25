package programspractice;

import java.util.Scanner;

public class PetrolQty {
	
	public static void main(String[] args) {
		
		int A,R;
		System.out.print("Enter the amount=");
		Scanner obj = new Scanner(System.in);
		A = obj.nextInt();
		System.out.print("Enter the rate of petrol per litre=");
		R = obj.nextInt();
		
		int c = A/R;
		System.out.print("Quantity of petrol will be=" + c+ " litre");
	}

}
