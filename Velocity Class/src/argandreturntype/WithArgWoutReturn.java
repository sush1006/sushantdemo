package argandreturntype;

public class WithArgWoutReturn {

	public void M1(int a, int b) {   //With Arguement and Without Return Type Method
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		WithArgWoutReturn object = new WithArgWoutReturn();
		object.M1(43, 71);
		object.M1(72, 89);
	}
}