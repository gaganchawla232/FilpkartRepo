package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestUtility;

public class NotificationM {

	WebDriver driver=null;
	public NotificationM(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement notificationMessage() throws IOException {
	return	driver.findElement(By.xpath(TestUtility.elementLocator("Notification_Message_xpath")));
		}

	public void desktopNotification() throws IOException {
		driver.findElement(By.xpath(TestUtility.elementLocator("Notification_Desktop_Notification_xpath"))).click();
		}
		
}
