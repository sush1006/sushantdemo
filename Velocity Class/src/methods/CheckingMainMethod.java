package methods;

public class CheckingMainMethod {

	public static void second() {
		System.out.println("2");
	}
	
	public static void fourth() {
		System.out.println("4");
	}
	
	public static void first() {
		System.out.println("1");
	}
	
	public static void third() {
		System.out.println("3");
	}
	
	public static void fifth() {
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		first();
		second();
		third();
		fourth();
		fifth();
	}
}
