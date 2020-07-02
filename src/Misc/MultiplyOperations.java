package Misc;

public class MultiplyOperations {
	public int Mul(int a, int b) {
				int Mul=a*b;
				System.out.println("int Mul=" +Mul);
				return Mul;
				
			}
			public float Mul(float a, float b) {
				float Mul=a*b;
				System.out.println("float Mul=" +Mul);
				return Mul;
				
			}
			public double Mul(double a, double b) {
				double Mul=a*b;
				System.out.println("double Mul=" +Mul);
				return Mul;
				
			}
			/*public String Mul(char a, char b) {
				String Mul=Character.toString(a)*Character.toString(b);
				System.out.println("char Mul=" +Mul);
				return Mul;
				
			}*/
			/*public String Mul(String a, String b) {
				String Mul=(String) (a+b);
				System.out.println("String Mul=" +Mul);
				return Mul;
				
			}*/
			public int[] Mul(int a[], int b[]) {
				//System.out.println("a" +);
				//System.out.println("b" +b);
				int aLen=a.length;
				int bLen=b.length;	
				int[] Mul=new int[aLen*bLen];
				System.arraycopy(a,0,b,0,aLen);
				System.arraycopy(b,0,Mul,aLen, bLen);
				System.out.println("int arr Mul=" +Mul);
				return Mul;	
			}
			/*public String[] Mul(String a[], String b[]) {
				int aLen=a.length;
				int bLen=b.length;	
				String[] Mul=new String[aLen+bLen];
				System.arraycopy(a,0,b,0,aLen);
				System.arraycopy(b,0,Mul,aLen, bLen);
				System.out.println("String arr Mul=" +Mul);
				return Mul;	*/
			
		}


