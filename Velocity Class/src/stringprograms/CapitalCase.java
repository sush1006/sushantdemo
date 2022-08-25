package stringprograms;

public class CapitalCase {

	public static void main(String[] args) {

		String S = "i love india";
		String[] S1 = S.split("\\s");

		for (String S2 : S1) {

			System.out.print(S2.substring(0, 1).toUpperCase() + S2.substring(1, S2.length()) + " ");
		}

	}
}
