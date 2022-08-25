package array;

public class UsingArrayLiteral {

	static int[] array1 = {3,76,34,94,12,64,99,12,14,27,54,38};  //static array literal
	
	boolean[] array2 = {true,false,true,false,true,true};       //non static array literal
	
	public static void main(String[] args) {
		
		byte[] array3 = {34,65,12,43,21,127};               // local array literal
		
		for (int i=0; i<array1.length; i++)
			System.out.println(array1[i]);           		//printing static array literal       
		
		UsingArrayLiteral obj = new UsingArrayLiteral();
		for (int i=0; i<obj.array2.length; i++)             //object used for non static array
			System.out.println(obj.array2[i]);				//object used for printing non static array literal
		
		for (int i=0; i<array3.length; i++)
			System.out.println(array3[i]);				//printing local array literal
	}
}
