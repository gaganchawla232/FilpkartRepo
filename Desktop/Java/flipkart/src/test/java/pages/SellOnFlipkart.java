package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestUtility;

public class SellOnFlipkart {

	WebDriver driver;
	public SellOnFlipkart(WebDriver driver) {
		this.driver=driver;
	}
	
  public void enterPhoneNumber(String phoneNumber) throws IOException {
  driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkart_PhoneNumberTextbox_xpath"))).sendKeys(phoneNumber);		
	}

  public WebElement getTextPhoneNumber() throws IOException {
	 return driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkart_PhoneNumberTextbox_xpath")));		
		}

  
	public void clickRegisterButton() throws IOException {
	    driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkart_Register_xpath"))).click();		
		}

	public WebElement verifyPhoneRegisteredMessage() throws IOException {
	   return driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkart_PhoneNumberAlreadyRegisteredMessage_xpath")));		
		}
	}