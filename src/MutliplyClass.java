
public class MutliplyClass {
	static SubstarctionClass  sub = new SubstarctionClass();
	
	public Integer multiply(int a, int b){
		int tot=0;
		tot = a*b;
		return tot;
	}
	
	public Integer add(int a, int b, int e){
		int tot=0;
		tot = a+b+e;
		return tot;
	}
	
	public int callSubMethod(int a, int b){
		int subTotal= sub.substarction(a, b);
		return subTotal;

	}

	public int add(int c, int e) {
		int tot=0;
		tot=c+e;
		return tot;
	}
	
	public String add(String first, String second){
		
		String third = first+" "+second;
		return third;
		
	}

	
	
	

}
