package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling {
		
public static void multiWindowsHandling(String parent,WebDriver driver) {
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> iterator=windows.iterator();
	
	while(iterator.hasNext()) {

		String child=iterator.next();
		driver.switchTo().window(child);			

		if(!child.equalsIgnoreCase(parent)) {
driver.switchTo().window(child);			
		}
	}
	}
}