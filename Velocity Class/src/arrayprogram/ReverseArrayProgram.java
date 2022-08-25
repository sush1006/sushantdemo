package arrayprogram;

public class ReverseArrayProgram {

	static int[] abc= {34,56,21,26,75,33,25,12};
	
	public static void main(String[] args) {
		System.out.println("Given array is: ");
		for(int i=0; i<abc.length; i++)
			System.out.print(abc[i] + " ");
		
		System.out.println(" ");
		System.out.println("Reverse array is: ");
		for(int i=abc.length-1; i>=0; i--)
			System.out.print(abc[i]+ " ");
	}
}
