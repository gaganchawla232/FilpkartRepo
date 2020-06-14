package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	static WebDriverWait wait;
	public static void waitForElementsToBeVisible(WebDriver driver,WebElement element) {
		 wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForElmentsToBeClickable(WebDriver driver,WebElement element) {
		 wait=new WebDriverWait(driver, 60);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForElmentsToBeSelected(WebDriver driver,WebElement element) {
		 wait=new WebDriverWait(driver, 120);
		 wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public static void pageLoadTimeOut(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}
}
