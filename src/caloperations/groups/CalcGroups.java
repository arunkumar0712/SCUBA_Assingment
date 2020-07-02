package caloperations.groups;

import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.application.GettersAndSetters;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CalcGroups extends GettersAndSetters{
	int IntResult;
	float FloatResult;


	@Test(groups = {"Addition","Integer"})
	@Parameters({"IntVal1", "IntVal2"})
	public void GroupAddInt(int Val1, int Val2) {
		IntResult= getObjSum().Sum(Val1, Val2);
		Reporter.log("GroupAddInt completed", true);

	}
	@Test(groups = {"Addition", "Float"})
	@Parameters({"FloatVal1", "FloatVal2"})
	public void GroupAddFloat(float Val1, float Val2) {
		FloatResult=getObjSum().Sum(Val1, Val2);

	}

	@Test(groups = {"Subtraction","Integer"})
	@Parameters({"IntVal1", "IntVal2"})
	public void GroupSubInt(int Val1, int Val2) {
		IntResult= getObjDiff().Sub(Val1, Val2);

	}
	@Test(groups = {"Subtraction", "Float"})
	@Parameters({"FloatVal1", "FloatVal2"})
	public void GroupSubFloat(float Val1, float Val2) {
		FloatResult=getObjDiff().Sub(Val1, Val2);

	}
	@Test(groups = {"Multiplication","Integer"})
	@Parameters({"IntVal1", "IntVal2"})
	public void GroupMulInt(int Val1, int Val2) {
		IntResult= getObjMul().Mul(Val1, Val2);

	}
	@Test(groups = {"Multiplication", "Float"})
	@Parameters({"FloatVal1", "FloatVal2"})
	public void GroupMulFloat(float Val1, float Val2) {
		FloatResult=getObjMul().Mul(Val1, Val2);


	}
	@Test(groups = {"Division","Integer"})
	@Parameters({"IntVal1", "IntVal2"})
	public void GroupDivInt(int Val1, int Val2) {
		IntResult= getObjDiv().Div(Val1, Val2);

	}
	@Test(groups = {"Division", "Float"})
	@Parameters({"FloatVal1", "FloatVal2"})
	public void GroupDivFloat(float Val1, float Val2) {
		FloatResult=getObjDiv().Div(Val1, Val2);

	}



	@BeforeGroups(groups = {"Addition"})
	public void BeforAdd() {
		System.out.println("++++ The Addition functionality has started ++++");
	}
	@BeforeGroups(groups = {"Subtraction"})
	public void BeforSub() {
		System.out.println("---- The Subtraction functionality has started ----");
	}
	@BeforeGroups(groups = {"Multiplication"})
	public void BeforMul() {
		System.out.println("**** The Multiplication functionality has started ****");
	}
	@BeforeGroups(groups = {"Division"})
	public void BeforDiv() {
		System.out.println("//// The Division functionality has started ////");
	}

	@AfterGroups(groups = {"Addition"})
	public void AdditionResults() {
		System.out.println("++++ The Addition functionality is complete ++++");
		System.out.println("And the results are: \n Int result= " +IntResult+ "\n Float result= " +FloatResult);
	}
	@AfterGroups(groups = {"Subtraction"})
	public void SubtractionResults() {
		System.out.println("---- The Subtraction functionality is complete ----");
		System.out.println("And the results are: \n Int result= " +IntResult+ "\n Float result= " +FloatResult);
	}
	@AfterGroups(groups = {"Multiplication"})
	public void MultiplicationResults() {
		System.out.println("**** The Multiplication functionality is complete ****");
		System.out.println("And the results are: \n Int result= " +IntResult+ "\n Float result= " +FloatResult);
	}
	@AfterGroups(groups = {"Division"})
	public void DivisionResults() {
		System.out.println("//// The Division functionality is complete ////");
		System.out.println("And the results are: \n Int result= " +IntResult+ "\n Float result= " +FloatResult);
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
