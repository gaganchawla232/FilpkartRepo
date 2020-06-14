package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptFunctions {

	WebDriver driver;
	JavascriptExecutor js;
	public JavascriptFunctions(WebDriver driver) {
		this.driver=driver;
		 js=(JavascriptExecutor)driver;
	}
	
	public void verticalScroll() {
		js.executeScript("window.scrollTo(200,0);","");
	}
}
