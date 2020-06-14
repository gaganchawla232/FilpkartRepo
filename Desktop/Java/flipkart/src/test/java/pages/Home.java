package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import utilities.TestUtility;

public class Home {

	WebDriver driver=null;
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
public void enterEmail(String email) throws IOException {
	driver.findElement(By.xpath(TestUtility.elementLocator("Login_Email_xpath"))).sendKeys(email);
	
}

public void enterPassword(String password) throws IOException {
	driver.findElement(By.xpath(TestUtility.elementLocator("Login_Password_xpath"))).sendKeys(password);
}
public void clickLoginLogin() throws IOException {
	driver.findElement(By.xpath(TestUtility.elementLocator("Login_Login_xpath"))).click();
}
public void clickHomeLogin() throws IOException {
	driver.findElement(By.linkText(TestUtility.elementLocator("Home_Login_LinkText"))).click();
}

public void searchItem(String Item) throws IOException {
	driver.findElement(By.xpath(TestUtility.elementLocator("Home_Search_xpath"))).sendKeys(Item);
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
}

public void X() throws IOException {
	driver.findElement(By.xpath(TestUtility.elementLocator("Login_X_xpath"))).click();
}

public boolean invalidcredentialsMessage() throws IOException {
return (driver.findElement(By.xpath(TestUtility.elementLocator("Login_InvalidCredentials_xpath"))).isDisplayed());
}

public void clickCartButton() throws IOException {
driver.findElement(By.xpath(TestUtility.elementLocator("Home_Cart_xpath"))).click();
}

public void clickRequestOtpButton() throws IOException {
driver.findElement(By.xpath(TestUtility.elementLocator("Home_RequestOTP_xpath"))).click();
}

public WebElement errorMessage() throws IOException {
return driver.findElement(By.xpath(TestUtility.elementLocator("Home_ErrorMessage_xpath")));
}

public WebElement moreButton() throws IOException {
return driver.findElement(By.xpath(TestUtility.elementLocator("Home_More_xpath")));
}

public void notification() throws IOException {
 driver.findElement(By.xpath(TestUtility.elementLocator("Home_Notification_Preferences_xpath"))).click();
}

public void clickSellOnflipkart() throws IOException {
	 driver.findElement(By.xpath(TestUtility.elementLocator("Home_Sell_On_Flipkart_xpath"))).click();
	}


}