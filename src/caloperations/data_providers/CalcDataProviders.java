package caloperations.data_providers;

import org.testng.annotations.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import calculator.application.GettersAndSetters;


//import Calculator_01.CalculatorAddOperation;

public class CalcDataProviders extends GettersAndSetters {

	@DataProvider(name="int inputs")
	public Object[][] IntData() {
		return new Object[][] {
			{5,6},
			{11,22},
			{50,50},
			{150,500}
		};
	}
	@DataProvider(name="float inputs")
	public Object[][] FloatData() {
		return new Object[][] {
			{11.2f,12.0f},
			{5.8f,8.2f},
			{5.0f,5.0f},
			{18.8f,12.2f}
		};
	}



	@Test(dataProvider="int inputs")
	public void dataProvider1(int input1, int input2) {

		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
		getObjSum().Sum(input1, input2);
		getObjDiff().Sub(input1, input2);
		getObjMul().Mul(input1, input2);
		getObjDiv().Div(input1, input2);
		Reporter.log("dataProvider1 completed", true);
	}
	@Test(dataProvider="float inputs")
	public void dataProvider2(float input1, float input2) {

		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
		getObjSum().Sum(input1, input2);
		getObjDiff().Sub(input1, input2);
		getObjMul().Mul(input1, input2);
		getObjDiv().Div(input1, input2);
		Reporter.log("dataProvider2 completed", true);

	}



	@BeforeClass
	public void openApp() {
		Reporter.log("Welcome!! Calculator application has been initiated \n", true);
	}

	@AfterClass
	public void closeApp() {
		Reporter.log("\n **** The operations have been completed. Exiting App ****.\n \t \t 'HAVE A GREAT DAY!!!' \n", true);
	}

}


