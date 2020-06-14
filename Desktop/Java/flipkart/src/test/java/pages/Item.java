package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestUtility;

public class Item {

	WebDriver driver;
	public Item(WebDriver driver) {
		this.driver=driver;
	}

public void enterPincode(String pincode) throws IOException {
	WebElement pincodeEnter=driver.findElement(By.xpath(TestUtility.elementLocator("Item_Pincode_xpath")));

	pincodeEnter.clear();
	pincodeEnter.sendKeys(pincode);
}

public void checkPincode() throws IOException {
	driver.findElement(By.xpath(TestUtility.elementLocator("Item_Check_xpath"))).click();
}

public void addToCart() throws IOException {
	//driver.findElement(By.className(TestUtility.elementLocator("Item_AddToCart_xpath"))).click();
//WebElement element= driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
//element.click();

//Screenshots.js(driver);
}

}