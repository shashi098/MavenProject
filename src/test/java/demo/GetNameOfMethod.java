package demo;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GetNameOfMethod implements ITestListener{
	ExtentHtmlReporter report ;
	ExtentReports extent;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		test.log(Status.INFO, "Test case has started");
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test case skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		report = new ExtentHtmlReporter(new File("C:\\Users\\HP\\Desktop\\ExtentsReports\\Listener1.html"));
	   extent = new ExtentReports();
		extent.attachReporter(report);
		test = extent.createTest("ExtentDemotest2");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
