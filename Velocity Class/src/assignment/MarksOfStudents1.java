package assignment;

public class MarksOfStudents1 {   // With Argument and With Return Type Method

	public int studentmarks(int M, int P, int C, String StudentName) {
		System.out.println("Marks of " + StudentName + ":-");
		System.out.println("Maths: " + M);
		System.out.println("Physics: " + P);
		System.out.println("Chemistry: " + C);
		System.out.print("Total Marks: ");
		return M+P+C;
	}
	public static void main(String[] args) {
		MarksOfStudents1 object = new MarksOfStudents1();
				System.out.println(object.studentmarks(88, 84, 89, "Avdhut"));
				System.out.println();
				System.out.println(object.studentmarks(93, 90, 96, "Raju"));
				System.out.println();
				System.out.println(object.studentmarks(78, 79, 75, "Joy"));
	}
}
