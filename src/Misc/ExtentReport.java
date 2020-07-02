package Misc;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	
	static ExtentTest test;
	static ExtentReports report;
	public static void log() {
		
	System.out.println("Test0");
	report = new ExtentReports("D:\\00_SCUBA\\TestNG_Assignment"+"\\ExtentReportResults.html");
	test = report.startTest("CalcAssert");
	System.out.println("Test");
	}

}
