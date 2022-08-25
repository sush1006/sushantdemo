package argandreturntype;

public class WoutArgWoutReturn {  

	public void M1() {   // Without Arguement and Without Return Type Method
		System.out.println("Without Arguement Without Return Type Method");
	}
	
	public static void main(String[] args) {
		WoutArgWoutReturn object = new WoutArgWoutReturn();
		object.M1();
	}
}
