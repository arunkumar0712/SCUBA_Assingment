package Misc;

public class CalculatorAddOperation {
	
	public int Sum(int a, int b) {
		int Sum=a+b;
		System.out.println("int Sum=" +Sum);
		return Sum;
		
	}
	public float Sum(float a, float b) {
		float Sum=a+b;
		System.out.println("float Sum=" +Sum);
		return Sum;
		
	}
	public double Sum(double a, double b) {
		double Sum=a+b;
		System.out.println("double Sum=" +Sum);
		return Sum;
		
	}
	
	public int[] Sum(int a[], int b[]) {
		//System.out.println("a" +);
		//System.out.println("b" +b);
		int aLen=a.length;
		int bLen=b.length;	
		int[] Sum=new int[aLen+bLen];
		System.arraycopy(a,0,b,0,aLen);
		System.arraycopy(b,0,Sum,aLen, bLen);
		System.out.println("int arr Sum=" +Sum);
		return Sum;	
	
	}
	
}
