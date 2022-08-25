package argandreturntype;

public class Combination {

	public int M1() {
		return 260;
	}
	
	public String M1(int a) {
		return "Sushant Jadhav";
	}
	
	public static void main(String[] args) {
		
		Combination object = new Combination();
		System.out.println(object.M1(28));
		System.out.println(object.M1());
	}
}
