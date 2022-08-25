package arrayprogram;

public class DuplicateValues {
	
	public static void main(String[] args) {
		
		int[] arrays = {23,65,21,85,35,65,72,98,67,48,11,19,85,32,23,44,66,19,44};
		
		for(int i=0; i< arrays.length; i++) {
			
			for(int j=i+1; j < arrays.length; j++) {
				
				if(arrays[i]==arrays[j])
					System.out.println(arrays[j]);
			}
		}
	}

}
