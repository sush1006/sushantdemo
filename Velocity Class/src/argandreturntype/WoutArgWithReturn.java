package argandreturntype;

public class WoutArgWithReturn {
	
	public String M1() {   //With Return and Without Arguement Method Type
		return "XYZ";
	}

	public static void main(String[] args) {
		WoutArgWithReturn object = new WoutArgWithReturn();
		System.out.println(object.M1());
	}
}
