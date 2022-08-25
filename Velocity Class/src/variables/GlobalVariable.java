package variables;

public class GlobalVariable {

	static int b = 156;
	int c = 865;
	
	static public void main (String[] args) {
	
		System.out.println(b);
	
	int b = 254;
	System.out.println(b);
	
	GlobalVariable object1 = new GlobalVariable();
			System.out.println(object1.c);
			
	GlobalVariable object2= new GlobalVariable();
			object2.c = 732;
			System.out.println(object2.c);
			
			System.out.println(object1.c);
}
}
