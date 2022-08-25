package methods;

public class NonStaticMethod {

	public void M1() {
		System.out.println("XYZ");
	}
	
	public static void M2() {
		System.out.println("M2= Static Method");
		NonStaticMethod Variable = new NonStaticMethod();
		Variable.M1();
	}
	
	public static void main(String[] args) {
		M2();
	}
}
