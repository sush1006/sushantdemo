package arrayprogram;

import java.util.Arrays;

public class ArraysComparison {

	public static void main(String[] args) {
		int[] first = {5,3,8,9,10};
		int[] second = {6,3,2,5,7,7,9};
		int[] third = {5,3,8,9,10};
		int[] fourth = {6,3,2,5,7,7,9};
		
		System.out.println(Arrays.equals(first, second));
		System.out.println(Arrays.equals(first, third));
		System.out.println(Arrays.equals(second, fourth));
		System.out.println(Arrays.equals(third, fourth));
		System.out.println(Arrays.equals(first, fourth));
		
		System.out.println(first[0]);
	}
}
