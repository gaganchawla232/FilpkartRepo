package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestUtility;
import utilities.WaitForElements;

public class Cart {
	
	WebDriver driver;
	public Cart(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement saveForLaterButton() throws IOException {
		return driver.findElement(By.xpath(TestUtility.elementLocator("Cart_SaveForLater_xpath")));
	}

	public WebElement quatityOfItem() throws IOException {
	return	driver.findElement(By.xpath(TestUtility.elementLocator("Cart_quatityOfItemAdded_xpath")));
	}

	public void addOneMoreItem() throws IOException{
		driver.findElement(By.xpath(TestUtility.elementLocator("Cart_+_xpath"))).click();
	
	}
	
	public WebElement returnOneMoreItem() throws IOException{
	return	driver.findElement(By.xpath(TestUtility.elementLocator("Cart_+_xpath")));
	
	}

	public void saveForLater() throws IOException {
		driver.findElement(By.xpath(TestUtility.elementLocator("Cart_SaveForLater_xpath"))).click();
	}
	public WebElement clickRemoveButton() throws IOException {
		return driver.findElement(By.xpath(TestUtility.elementLocator("Cart_Remove_xpath")));
	}
	public void clickCancelOnRemovingItem() throws IOException {
		 driver.findElement(By.xpath(TestUtility.elementLocator("Cart_Cancel_xpath")));
	}
	
public WebElement missingCartItems() throws IOException {
	return	 driver.findElement(By.xpath(TestUtility.elementLocator("Cart_Missing_Cart_items_xpath")));
}
	public void clickLoginOnMissingCartItem() throws IOException {
	 driver.findElement(By.xpath(TestUtility.elementLocator("Cart_Login_xpath"))).click();
}	

}