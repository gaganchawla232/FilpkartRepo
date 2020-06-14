package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestUtility;

public class Base {
 	WebDriver driver=null;
	
	public WebDriver f1() throws IOException {
		
		if(TestUtility.browserActivity("Browser").equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "./DriverExecutable/chromedriver.exe");
	driver=new ChromeDriver();
		}
	driver.get(TestUtility.browserActivity("URL"));
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

return driver;
	
	}
}