package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshots {
	
	 public static void clickByJavaScriptExc(WebDriver driver, WebElement webelment) {
		 
		 JavascriptExecutor javascript=(JavascriptExecutor)driver;
		 javascript.executeScript("arguments[0].click();",
				 webelment);
		 }

}