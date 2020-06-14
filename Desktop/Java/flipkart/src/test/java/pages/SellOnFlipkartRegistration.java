package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestUtility;

public class SellOnFlipkartRegistration {

	WebDriver driver;
	public SellOnFlipkartRegistration(WebDriver driver) {
		this.driver=driver;
	}	
	
	public void enterEmailAddress(String email) throws IOException {
	    driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_Email_xpath"))).sendKeys(email);		
		}
	
	public void enterOtp(String otp) throws IOException {
	    driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_OTP_xpath"))).sendKeys(otp);		
		}

	public void enterName(String name) throws IOException {
	    driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_Name_xpath"))).sendKeys(name);		
		}
	
	public void enterPassword(String password) throws IOException {
	    driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_Password_xpath"))).sendKeys(password);		
		}
	
	public WebElement showButton() throws IOException {
	return driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_Show_xpath")));		
		}
	
	public void clickTermsOfUse() throws IOException {
	 driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_TermsOfUse_linktext")));		
		}
	
	public WebElement cancelButton() throws IOException {
		return driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkartRegistration_TermsOfUse_Cancel_xpath")));		
			}
	
}
