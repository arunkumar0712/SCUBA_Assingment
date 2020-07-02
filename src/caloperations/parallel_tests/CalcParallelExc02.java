package caloperations.parallel_tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import calculator.application.GettersAndSetters;

public class CalcParallelExc02  extends GettersAndSetters{

	public String getTime() {
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String formattedDate=sdf.format(date);
		return formattedDate;
	}




	@Test
	public void test1() {
		getObjSum().Sum(1,2);
		System.out.println(" Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
	}

	@Test
	public void test2() {	
		getObjDiff().Sub(1,2);
		System.out.println(" Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
	}


	@BeforeClass(alwaysRun=true)
	public void openApp() {
		System.out.println("before class");
		Reporter.log("Welcome!! Calculator application has been initiated for 2nd class \n", true);
	}

	@AfterClass(alwaysRun=true)
	public void closeApp() {
		System.out.println("after class");
		Reporter.log("\n **** The operations have been completed for 2nd class. Exiting App ****.\n \t \t 'HAVE A GREAT DAY!!!' \n", true);
	}
}
