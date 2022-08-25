package arrayprogram;

public class AscendingOrder {
	
	static int[] data= {32,21,65,86,43,24,55,99,56,40,39};
	
	public static void main(String[] args) {
		int temp;
		
		for(int i=0; i < data.length; i++) {
			for(int j=i+1; j < data.length; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("Ascending order of given array: ");
		for (int i=0; i<data.length; i++)
		System.out.print(data[i] + " ");
	}

}