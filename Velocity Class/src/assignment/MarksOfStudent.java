package assignment;

public class MarksOfStudent {

	int M;
	int P;
	int C;
	
	public static void main (String[] args) {
		MarksOfStudent Raju = new MarksOfStudent();
		Raju.M = 88;
		Raju.P = 83;
		Raju.C = 81;
		MarksOfStudent Avdhut = new MarksOfStudent();
		Avdhut.M = 79;
		Avdhut.P = 76;
		Avdhut.C = 73;
		MarksOfStudent Joy = new MarksOfStudent();
		Joy.M= 92;
		Joy.P = 95;
		Joy.C = 99;
		System.out.println("Marks of Raju:");
		System.out.print("Maths:");
		System.out.println(Raju.M);
		System.out.print("Physics:");
		System.out.println(Raju.P);
		System.out.print("Chemistry:");
		System.out.println(Raju.C);
		System.out.println("Marks of Avdhut:");
		System.out.print("Maths:");
		System.out.println(Avdhut.M);
		System.out.print("Physics:");
		System.out.println(Avdhut.P);
		System.out.print("Chemistry:");
		System.out.println(Avdhut.C);
		System.out.println("Marks of Joy:");
		System.out.print("Maths:");
		System.out.println(Joy.M);
		System.out.print("Physics:");
		System.out.println(Joy.P);
		System.out.print("Chemistry:");
		System.out.println(Joy.C);
	}
}
