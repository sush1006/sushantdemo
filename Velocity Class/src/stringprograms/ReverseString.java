package stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String S= "TNAHSUS";
		String Rev= "";
						
		for(int i=S.length()-1; i>=0; i--)
			Rev= Rev + S.charAt(i);
		
		System.out.println(Rev);
	}
	
}
