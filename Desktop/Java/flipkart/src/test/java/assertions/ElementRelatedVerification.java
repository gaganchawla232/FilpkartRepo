package assertions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.TestUtility;

public class ElementRelatedVerification {
	
	WebDriver driver;
	
	public ElementRelatedVerification(WebDriver driver) {
		this.driver=driver;
	}
	
	public void pincodeConfirmationMessage() throws IOException, InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath(TestUtility.elementLocator
				("Item_DelieveryConfirmationMessage1_xpath"))).getText()+
				driver.findElement(By.xpath(TestUtility.elementLocator
						("Item_DelieveryConfirmationMessage2_xpath"))).getText()
				,"Delivery by 14 May, Thursday");
	}
	
	public void verifyNumberOfItems() throws IOException{
	Assert.assertEquals(driver.findElement(By.xpath(TestUtility.elementLocator("Cart_NumberOfItems_xpath"))).getText(),2);
	}
	public void verifyMissingLogin() throws IOException{
	Assert.assertEquals(driver.findElement(By.xpath(TestUtility.elementLocator("MyCart_MissingMEssage_xpath"))).getText(),"Login to see the items you added previously");
	}
	
	public void elementPresence(WebElement webElement) {
		Assert.assertTrue(webElement.isDisplayed());
	}
	
	public boolean elementNotPresent(WebElement webElement) {
		return webElement.isDisplayed();
	}
	public void elementEnabled(WebElement webElement) {
		Assert.assertTrue(webElement.isEnabled());
	}

	
	public void verifyMessage(String actual,String expected)
	{
		Assert.assertEquals(actual, expected);
	}
	
	public boolean messageExist(WebElement actual,String expected)
	{
   return actual.getText().equalsIgnoreCase(expected);
	}
	
}