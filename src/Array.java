
public class Array {

	public static void main(String[] args) {
		//Step-1 declaration 
		int[] array;
		
		// Step-2 array creation
		 array =new int[6];
		 
		 // Array Initialization
		 
		 array [0]= 2;
		 array [1]= 3;
		 array [2]= 4;
		 array [3]= 5;
		 array [4]= 6;
		 array [5]= 7;
		 
		// Lets see how many elements are present in array
		 System.out.println("size of arry is :" + array.length);
		 
		// Printing individual value using index example lets print value
		// present at 4th place that is having index 3
		 
		 System.out.println("Value present at 4th place is:" + array[3]);
		 
		/* Printing all values of array using index
		 for (int i = 0; i &lt= 5; i++) {
			 //System.out.println("Value sitted at index= " + i + " is "
			+ array[i]);
			 }*/
		 
		 //Second way
		 int[] array1= {2,3,4,5,6,7,8};
		 System.out.println("Size of arry is :" +array1.length);
		 
		 
		/* example of taking the max value of interator i.e. the size of array
		 for(int j= 0; j &lt; array1.length; j++){
			 System.out.println("Value sited in index" +j+ "is" + array1[j]);
			 
		 }*/
	}
		 
}
