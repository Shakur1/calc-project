
public class TestProject {
	static MutliplyClass mclass = new MutliplyClass();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int firstNum=2;
	    int secondNum=4;
	    int c=10;
	    int d=15;
	    int e= 20;
		int total=mclass.multiply(firstNum, secondNum);
		System.out.println("Total of multiplcation is: " +total);
		int sum= mclass.add(c, d,e);
		System.out.println("Total of sum is: " +sum);
		int sum1=mclass.add(c, e);
		System.out.println("Total of sum is: " +sum1);
		//int substarction = mclass.callSubMethod(5, 2);
		//System.out.println("Substarcion is:" +substarction);
		
		String kamal= "Hello";
		String kumar = "World";
		String john= mclass.add(kamal, kumar);
		System.out.println("Combined String is" +john);
	
		
		   
		//multiplySomething(2,3);
		 

	}
	

	

}
