package Misc;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CalculatorTestClass {
	
	public void test() {
		System.out.println("Test");	
	}
	
	
	/*@BeforeClass
	@Parameters({"Variable_1", "Variable_2"})
	public void setUp(String Variable_1, String Variable_2) {
		System.out.println("TestNG_Parameters -> Setup");
		System.out.println("1. Parameter value from xml file: " + Variable_1);
		System.out.println("2. Parameter value from xml file: " + Variable_2);
	}*/
	
	@Test
	@Parameters({"Operation","Variable 1", "Variable 2"})
	public int testMethod1(String Operation, int Variable_1, int Variable_2) throws InterruptedException {
		//String[] stringArray = response.split(",");
		int Sum = 0;
		System.out.println("TestNG_Parameters -> testMethod1");
		System.out.println("Response from xml file: " + Operation);
		switch(Operation) {
		case"Sum":
			 Sum=Variable_1+Variable_2;
			System.out.println("Result="+Operation +Sum);
			return Sum;
			
		}
		return Sum;
	}
	
	public void TestAssert()
	{
		//int[] SingleDigit= {1,2,3};
		//int[] DoubleDigit= {11,22,33};
		//sString[] League= {"LaLiga", "EPL", "Serie A", "Bundesliga"};
		//String[] Team= {"Real Madrid", "Liverpool", "Jeventus", "Dortmound"};
		CalculatorAddOperation obj = new CalculatorAddOperation();
		int IntSum=obj.Sum(1, 2);
		//obj.Sum(League, Team);
		System.out.println("int Sum=" +IntSum);
		Float FloatSum=(float) obj.Sum(11.22, 12.07);
		System.out.println("FloatSum Sum=" +FloatSum);
		//String CharSum=obj.Sum('A', 'R');
		//System.out.println("CharSum Sum=" +CharSum);
		//String StringSum= obj.Sum("Real ", "Madrid");	
		//System.out.println("int StringSum=" +StringSum);
		Assert.assertEquals(IntSum, 3);
		Assert.assertNotEquals(FloatSum, 11.22);
		Assert.assertFalse(IntSum==10, "Condition validated as false");
		//Assert.assertTrue(FloatSum==23.29, "Test");
		/*Assert.assertNotEquals(StringSum, "Barcelona", "Wrong Club");
		Assert.assertNotSame(CharSum, "AR", "Correct Char");		*/
		return;	
}
}
