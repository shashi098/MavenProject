package demo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public ExtentHtmlReporter report ;
	public ExtentReports extent;
	public ExtentTest test;
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//1.Create the HTML Report
		ExtentHtmlReporter report = new ExtentHtmlReporter(new File("C:\\Users\\HP\\Desktop\\ExtentsReports\\shashi.html"));
		
		//2.Create the Object of Extent reports class
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		//3.start the test
		
		ExtentTest test = extent.createTest("ExtentDemotest");
		
		driver.get("https://www.seleniumhq.org");
		
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Selenium-We"))
		{
			test.log(Status.PASS, "The title is verified");
			
		}
		
		else
		{
			test.log(Status.FAIL, "Title did not match");
		}
			
		extent.flush();
		driver.close();

	}

}
