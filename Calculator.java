public class Calculator{
	
	public static int add(int a,int b){
		return a+b;
	}
	
	public static int subtract(int a, int b){
		return a-b;
	}
	
	public static int multiply(int a, int b){
		return a*b;
	}
	
	public static double divide(int a, int b){
		double newA = (double)a;
		double newB = (double)b;
		return newA/newB;
	}
	
	public static int modulus(int a){
		if(a<0)
			return -1*a;
		else
			return a;
	}
	
}
