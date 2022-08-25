package array;

public class UsingNewKeyword {
	
	double [] nonstatarray = new double[4];  // declare array here but initialize in method only as a good practice
	
	public static void main(String[] args) {
		int [] localarray = new int[6];
		
		localarray[0]=8;
		localarray[1]=32;
		localarray[2]=23;
		localarray[3]=19;
		localarray[4]=57;
		localarray[5]=41;
		
		// System.out.println(array);   // can't execute without for loop
		
		for(int i=0; i<localarray.length; i++)
			System.out.println(localarray[i]);
		
		UsingNewKeyword obj = new UsingNewKeyword();   //object creation for non static array
		obj.nonstatarray[0]=27.18;                    //initializing non static array with object
		obj.nonstatarray[1]=34.45;                    
		obj.nonstatarray[2]=19.95;
		obj.nonstatarray[3]=48.69;
		
		for(int j=0; j<obj.nonstatarray.length; j++)   //object required for non static array
			System.out.println(obj.nonstatarray[j]);  //object required for printing non static array
		
	}

}
