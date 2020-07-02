package Misc;

public class DivideOperations {

		public int Div(int a, int b) {
					int Div=a/b;
					System.out.println("int Div=" +Div);
					return Div;
					
				}
				public float Div(float a, float b) {
					float Div=a/b;
					System.out.println("float Div=" +Div);
					return Div;
					
				}
				public double Div(double a, double b) {
					double Div=a/b;
					System.out.println("double Div=" +Div);
					return Div;
					
				}
				/*//public String Div(char a, char b) {
					String Div=Character.toString(a)/Character.toString(b);
					System.out.println("char Div=" +Div);
					return Div;
					
				}//
*/			/*	//public String Div(String a, String b) {
					String Div=(String) (a+b);
					System.out.println("String Div=" +Div);
					return Div;
					
				}//
*/				public int[] Div(int a[], int b[]) {
					//System.out.println("a" +);
					//System.out.println("b" +b);
					int aLen=a.length;
					int bLen=b.length;	
					int[] Div=new int[aLen/bLen];
					System.arraycopy(a,0,b,0,aLen);
					System.arraycopy(b,0,Div,aLen, bLen);
					System.out.println("int arr Div=" +Div);
					return Div;	
				}
				/*//public String[] Div(String a[], String b[]) {
					int aLen=a.length;
					int bLen=b.length;	
					String[] Div=new String[aLen+bLen];
					System.arraycopy(a,0,b,0,aLen);
					System.arraycopy(b,0,Div,aLen, bLen);
					System.out.println("String arr Div=" +Div);
					return Div;	//
*/				
			




	

}

