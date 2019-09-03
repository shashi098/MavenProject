package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(GetNameOfMethod.class)
public class IntigtaringWitListner {
	
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void Demo1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		
		String title = driver.getTitle();
		
		Reporter.log(title , true);
		driver.close();
	}

}
