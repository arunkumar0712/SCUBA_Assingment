package calculator.application;

public class calculatorOperations  {

	//++++++++++++ Addition Operations ++++++++++++//

	public int Sum(int a, int b) {										//Method to add 2 integer values
		int Sum=a+b;
		System.out.println("int Sum=" +Sum);
		return Sum;

	}
	public float Sum(float a, float b) {								//Method to add 2 Float values
		float Sum=a+b;
		System.out.println("float Sum=" +Sum);
		return Sum;

	}
	public double Sum(double a, double b) {								//Method to add 2 Double values
		double Sum=a+b;
		System.out.println("double Sum=" +Sum);
		return Sum;

	}

	public int[] Sum(int a[], int b[]) {								//Method to add 2 Array values
		int aLen=a.length;
		int bLen=b.length;	
		int[] Sum=new int[aLen+bLen];
		System.arraycopy(a,0,b,0,aLen);
		System.arraycopy(b,0,Sum,aLen, bLen);
		System.out.println("int arr Sum=" +Sum);
		return Sum;	

	}
	public int Sum(int a, int b, int c) {								   //Method to add 3 integer values
		int Sum=a+b+c;
		System.out.println("int Sum=" +Sum);
		return Sum;

	}

	//---------- Subtraction Operations ------------//

	public int Sub(int a, int b) {											//Method to Subtract 2 integer values
		int Sub=a-b;
		System.out.println("int Sub=" +Sub);
		return Sub;

	}
	public float Sub(float a, float b) {									//Method to Subtract 2 float values
		float Sub=a-b;
		System.out.println("float Sub=" +Sub);
		return Sub;

	}
	public double Sub(double a, double b) {									//Method to Subtract 2 double values
		double Sub=a-b;
		System.out.println("double Sub=" +Sub);
		return Sub;

	}
	
	public int Sub(int a, int b, int c) {									//Method to Subtract 3 integer values
		int Sub=a-b;
		System.out.println("int Sub=" +Sub);
		return Sub;

	}
	
	
	//************ Multiplication Operations ************//
		
	public int Mul(int a, int b) {											//Method to Multiply 2 integer values
		int Mul=a*b;	
		System.out.println("int Mul=" +Mul);
		return Mul;

	}
	public float Mul(float a, float b) {                                   //Method to Multiply 2 float values
		float Mul=a*b;
		System.out.println("float Mul=" +Mul);
		return Mul;

	}
	public double Mul(double a, double b) {								  //Method to Multiply 2 double values
		double Mul=a*b;
		System.out.println("double Mul=" +Mul);
		return Mul;

	}

	public int[] Mul(int a[], int b[]) {								 //Method to Multiply 2 array values
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
	

	public int Mul(int a, int b, int c, int d) {						 //Method to Multiply 4 integer values
		int Mul=a*b*c*d;
		System.out.println("int Mul=" +Mul);
		return Mul;

	}
	
	
	// \\\\\\\\\\ Division Operations \\\\\\\\\\ //
	
	public int Div(int a, int b) {										 //Method to Divide 2 integer values
		int Div=a/b;
		System.out.println("int Div=" +Div);
		return Div;

	}
	public float Div(float a, float b) {								 //Method to Divide 2 float values
		float Div=a/b;
		System.out.println("float Div=" +Div);
		return Div;

	}
	public double Div(double a, double b) {								 //Method to Divide 2 double values
		double Div=a/b;
		System.out.println("double Div=" +Div);
		return Div;

	}

	public int[] Div(int a[], int b[]) {							     //Method to Divide 2 array values
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

}




