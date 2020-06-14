package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.TestUtility;

public class Search {

	WebDriver driver;
	public Search(WebDriver driver) {
		this.driver=driver;
	}

public void selectItem() throws IOException, InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText(TestUtility.elementLocator("Search_Item_Linktext"))).click();
}
}
