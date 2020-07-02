package Misc;

public class SubtractOperations {
	
	
		public int Sub(int a, int b) {
			int Sub=a-b;
			System.out.println("int Sub=" +Sub);
			return Sub;
			
		}
		public float Sub(float a, float b) {
			float Sub=a-b;
			System.out.println("float Sub=" +Sub);
			return Sub;
			
		}
		public double Sub(double a, double b) {
			double Sub=a-b;
			System.out.println("double Sub=" +Sub);
			return Sub;
			
		}
		/*public String Sub(char a, char b) {
			String Sub=Character.toString(a)-Character.toString(b);
			System.out.println("char Sub=" +Sub);
			return Sub;
			
		}*/
		/*public String Sub(String a, String b) {
			String Sub=(String) (a+b);
			System.out.println("String Sub=" +Sub);
			return Sub;
			
		}*/
		public int[] Sub(int a[], int b[]) {
			//System.out.println("a" +);
			//System.out.println("b" +b);
			int aLen=a.length;
			int bLen=b.length;	
			int[] Sub=new int[aLen-bLen];
			System.arraycopy(a,0,b,0,aLen);
			System.arraycopy(b,0,Sub,aLen, bLen);
			System.out.println("int arr Sub=" +Sub);
			return Sub;	
		}
		/*public String[] Sub(String a[], String b[]) {
			int aLen=a.length;
			int bLen=b.length;	
			String[] Sub=new String[aLen+bLen];
			System.arraycopy(a,0,b,0,aLen);
			System.arraycopy(b,0,Sub,aLen, bLen);
			System.out.println("String arr Sub=" +Sub);
			return Sub;	*/
		
	}


