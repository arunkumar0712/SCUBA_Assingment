package caloperations.asserts;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import calculator.application.*;

public class CalcAssert extends GettersAndSetters {

	@BeforeClass(alwaysRun=true)
	public void openApp() {
		Reporter.log("Welcome!! Calculator application has been initiated \n", true);
	}

	@Test
	public void TestAssert() {

		// ********Arithmetic Operations********//

		int IntSum = getObjSum().Sum(1, 2);
		Float FloatSum = (float) getObjSum().Sum(11.22f, 12.07f);
		double Sub = getObjDiff().Sub(55.24, 85.14);
		int IntMul = getObjMul().Mul(5, 8);
		float FloatDiv = getObjDiv().Div(22.10f, 11.05f);
		int intDiv = getObjDiv().Div(22, 11);

		// ********Assert Operations********//

		Assert.assertEquals(IntSum, 3);
		Assert.assertNotEquals(FloatSum, 11.22);
		Assert.assertFalse(IntSum == 10, "Condition validated as false");
		Assert.assertTrue(FloatDiv != 5);
		Assert.assertSame(IntMul, 40);
		Assert.assertEquals(Sub, -29.9);
		Assert.assertNotSame(intDiv, 10, "The Values are not same");
		Reporter.log("Assertion completed", true);

		return;

	}


	@AfterClass
	public void closeApp() {
		Reporter.log("\n **** The operations has been completed. Exiting App ****.\n \t \t 'HAVE A GREAT DAY!!!' \n", true);
	}

}
