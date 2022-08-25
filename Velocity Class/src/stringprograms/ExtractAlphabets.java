package stringprograms;

public class ExtractAlphabets {

	public static void main(String[] args) {
		String S1 = "Sushant123Jadhav";       		    // remove digits
		String S2 = "Sushant@123Jadhav";     		   // remove digits and special char
		String S3 = "123ABCnhRt456vX789";	 		  // remove alphabets
		String S4 = "&*%@SushantJadhav12345@%";	 	 // remove special char
		
		String newS1 = S1.replaceAll("[0-9]", "");
		String newS2 = S2.replaceAll("[^a-zA-Z]", "");  // ^ is used as NOT
		String newS3 = S3.replaceAll("[a-zA-Z]", "");
		String newS4 = S4.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(newS1);
		System.out.println(newS2);
		System.out.println(newS3);
		System.out.println(newS4);
		
	}
}
