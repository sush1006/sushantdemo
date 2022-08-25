package arrayprogram;

public class DescendingOrder {

static int[] data= {65,-45,96,23,54,68,-3,90,-43};
	
	public static void main(String[] args) {
		int temp;
		
		for(int i=0; i < data.length; i++) {
			for(int j=i+1; j < data.length; j++) {
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("Descending order of given array: ");
		for (int i=0; i<data.length; i++)
		System.out.print(data[i] + " ");
	}

}
