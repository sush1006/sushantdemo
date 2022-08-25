package assignment;

public class MarksOfStudents2 {   // Without Arguement and Without Return Type Methods

	public void Avdhut() {
		int M = 88, P = 84, C = 89;
		System.out.println("Marks of Avdhut: ");
		System.out.println("Maths: " + M);
		System.out.println("Physics: " + P);
		System.out.println("Chemistry: " + C);
		int T = M+P+C;
		System.out.println("Total Marks: " + T);
		System.out.println();
	}
	
	public void Raju() {
		int M = 93, P = 90, C = 96;
		System.out.println("Marks of Raju: ");
		System.out.println("Maths: " + M);
		System.out.println("Physics: " + P);
		System.out.println("Chemistry: " + C);
		int T = M+P+C;
		System.out.println("Total Marks: " + T);
		System.out.println();
	}
	
	public void Joy() {
		int M = 78, P = 79, C = 75;
		System.out.println("Marks of Raju: ");
		System.out.println("Maths: " + M);
		System.out.println("Physics: " + P);
		System.out.println("Chemistry: " + C);
		int T = M+P+C;
		System.out.println("Total Marks: " + T);
		System.out.println();
	}
	
	public static void main(String[] args) {
		MarksOfStudents2 object = new MarksOfStudents2();
		object.Avdhut();
		object.Raju();
		object.Joy();
	}
}
