package caloperations.parameters;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.application.GettersAndSetters;


public class CalcParameters extends GettersAndSetters {

	@Test
	@Parameters({"Val1", "Val2", "Operation"})
	public void IntTestParameter(int Val1, int Val2, String Operation) throws InterruptedException {

		int Result=0;
		System.out.println("Value 1 from xml file: " + Val1);
		System.out.println("Value 2 from xml file: " + Val2);
		switch (Operation) {

		case "Addition":
			Result=getObjSum().Sum(Val1, Val2);
			System.out.println("Sum=" +Result);
			break;
		case "Subtract":
			Result=getObjDiff().Sub(Val1,  Val2);
			System.out.println("Difference=" +Result);
			break;
		case "Divide":
			if(Val1==0||Val2==0)
			{
				System.out.println("Invalid values!!Please ensure to give non-zero values. ");
				break;
			}
			Result=getObjDiv().Div(Val1, Val2);
			System.out.println("Division=" +Result);
			break;
		case "Multiply":
			Result=getObjMul().Mul(Val1,  Val2);
			System.out.println("Product=" +Result);
			break;
		case "Exponent":
			Result =(int) Math.pow(Val1,Val2);
			System.out.println("Exponent Value= " +Result);
		default:
			System.out.println("Please provide a Valid Operation");
			break;
		}
	}

	@Test
	@Parameters({"Val1", "Val2", "Operation"})
	public void FloatTestParameter(@Optional()double Val1, double Val2, String Operation) throws InterruptedException {
		double Result=0;
		System.out.println("Value 1 from xml file: " + Val1);
		System.out.println("Value 2 from xml file: " + Val2);
		switch (Operation) {

		case "Addition":
			Result=getObjSum().Sum(Val1, Val2);
			System.out.println("Sum=" +Result);
			break;
		case "Subtract":
			Result=getObjDiff().Sub(Val1,  Val2);
			System.out.println("Difference=" +Result);
			break;
		case "Divide":
			if(Val1==0||Val2==0)
			{
				System.out.println("Invalid values!!Please ensure to give non-zero values. ");
				break;
			}
			Result=getObjDiv().Div(Val1, Val2);
			System.out.println("Division=" +Result);
			break;
		case "Multiply":
			Result=getObjMul().Mul(Val1,  Val2);
			System.out.println("Product=" +Result);
			break;
		}
		Reporter.log("Parameter test completed successfully", true);
	}
	@BeforeClass(alwaysRun=true)
	public void openApp() {
		System.out.println("before class");
		Reporter.log("Welcome!! Calculator application has been initiated \n", true);
	}

	@AfterClass(alwaysRun=true)
	public void closeApp() {
		System.out.println("after class");
		Reporter.log("\n **** The operations have been completed. Exiting App ****.\n \t \t 'HAVE A GREAT DAY!!!' \n", true);
	}
}
