package exception;

public class throwshandling {
	
	

	public static void main (String[] args) throws InterruptedException,ArithmeticException {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		Thread.sleep(2000);          //this is compile time exception and is handled by throws 
		System.out.println(5);
		System.out.println(6);
		System.out.println(7/0);    //this is run time exception and is not handled by throws
		System.out.println(8);
		System.out.println(9);
		
	}
}
