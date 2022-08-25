package arrayprogram;

import java.util.Arrays;

public class SortingMethod {

	public static void main(String[] args) {
		
		int[] values = {56,84,2,55,-43,64,78,43,33,90,76};
		
		Arrays.sort(values);        //sort in ascending   
		
		System.out.println("Ascending order of given array: ");
		for(int i=0; i < values.length; i++)
			System.out.print(values[i] + " ");   // printing in ascending order
		
		System.out.println();
		System.out.println("Descending order of given array: ");
		for(int i=values.length-1; i>=0; i--)
			System.out.print(values[i] + " ");  //printing in descending order
	
	}
}
