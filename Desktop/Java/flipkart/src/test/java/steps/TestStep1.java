package steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.management.Notification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import assertions.BrowserRelatedVerification;
import assertions.ElementRelatedVerification;
import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Cart;
import pages.Home;
import pages.Item;
import pages.NotificationM;
import pages.Search;
import pages.SellOnFlipkart;
import pages.SellOnFlipkartRegistration;
import utilities.ActionsClass;
import utilities.JavascriptFunctions;
import utilities.MultipleWindowHandling;
import utilities.TestUtility;
import utilities.WaitForElements;

public class TestStep1 {

	WebDriver driver;
	Home home;
	Search search;
	Item item;
	Cart cart;
	ElementRelatedVerification elementRelatedVerification;
	NotificationM notification;
BrowserRelatedVerification browserRelatedVerification; 
SellOnFlipkart sellOnFlipkart;	
JavascriptFunctions javascriptFunctions;
SellOnFlipkartRegistration sellOnFlipkartRegistration;
	String parent;

	@Given("^User login to flipkart$")
	public void user_login_to_flipkart() throws IOException, InterruptedException {
		Base b = new Base();
		driver = b.f1();
		home = new Home(driver);
		System.out.println(driver.getWindowHandles());
		home.enterEmail("chawlagagan123@gmail.com");
		home.enterPassword("gG@9716625679");
		home.clickLoginLogin();
		home.X();
	}

	@When("^User search item$")
	public void user_search_item() throws IOException, InterruptedException {
		search = new Search(driver);
		home.searchItem("electronic");
		search.selectItem();
	}

	@When("^User added item to cart$")
	public void user_added_item_to_cart() throws Throwable {
		item = new Item(driver);
		 parent = driver.getWindowHandle();
		 WaitForElements.pageLoadTimeOut(driver);
		 MultipleWindowHandling.multiWindowsHandling(parent, driver);
		 item.enterPincode("110051");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		System.out.println("Pincode Entered");

		item.checkPincode();
		
		System.out.println("Pincode checked");
		 parent = driver.getWindowHandle();
		 driver.get(driver.getCurrentUrl());

		 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();			
	System.out.println("Add to cart");
		
	}

	@When("^User make changes in Cart$")
	public void user_make_changes_in_Cart() throws Throwable {
		cart=new Cart(driver);
			System.out.println("enter step");
WaitForElements.pageLoadTimeOut(driver);	

for(int i=1;i<=3;i++) {
try {
	cart.addOneMoreItem();
		System.out.println("add 1 more item");
		cart.saveForLater();
		System.out.println("save for later");
	}
catch(Exception e) {
e.printStackTrace();
System.out.println("Exception");
}
}
}
		
	@When("^User make payment$")
	public void user_make_payment() throws Throwable {

	}

	@Then("^User successfully delievered to customer$")
	public void user_successfully_delievered_to_customer() throws Throwable {

	}
	
	@When("^Item is out of stock$")
	public void item_is_out_of_stock() throws Throwable {
	}

	@Then("^Navigate back to flipkart home screen$")
	public void navigate_back_to_flipkart_home_screen() throws Throwable {
	}

	@When("^User select Cart option$")
	public void user_select_Cart_option() throws Throwable {
		home=new Home(driver);
		cart=new Cart(driver);
		home.clickCartButton();
	   // cart.clickRemoveButton();
	}

	@When("^User remove item from cart$")
	public void user_remove_item_from_cart() throws Throwable {
	}
	
	@When("^If no item is added in Cart$")
	public void if_no_item_is_added_in_Cart() throws Throwable {
//	try {
//while(cart.missingCartItems().isDisplayed()) {
//			cart.clickLoginOnMissingCartItem();
//		//	System.out.println("2");
//	j++;
//		}	
//	if(j==5) {
//		break;
//	}
//	}
//	
//	catch(Exception e) {
//	System.out.println("abc");	
//	}
/*try {
		if(cart.missingCartItems().getText().equalsIgnoreCase("Missing Cart items?")) {
			cart.clickLoginOnMissingCartItem();
		}
}
catch(Exception e) {
System.out.println("Exception");
	if(cart.missingCartItems().getText().equalsIgnoreCase("Missing Cart items?")) {
		cart.clickLoginOnMissingCartItem();
	}
}*/
		cart.clickLoginOnMissingCartItem();	
		home.clickRequestOtpButton();
	elementRelatedVerification=new ElementRelatedVerification(driver);
	elementRelatedVerification.elementPresence(home.errorMessage());
	}

	@Then("^Login again$")
	public void login_again() throws Throwable {
	}

	@When("^Select More option$")
	public void select_More_option() throws Throwable {
    ActionsClass.actionsOnItem(driver, home.moreButton());
	home.notification();
	
	notification=new NotificationM(driver);
 elementRelatedVerification.verifyMessage( notification.notificationMessage().getText(), "Desktop Notifications");
notification.desktopNotification();
browserRelatedVerification=new BrowserRelatedVerification();
browserRelatedVerification.verifyUrl(driver.getCurrentUrl(), "https://www.flipkart.com/communication-preferences/push");
	
	}
	
	@When("^Sell on Flipkart$")
	public void sell_on_Flipkart() throws Throwable {
		sellOnFlipkart=new SellOnFlipkart(driver);
		ActionsClass.actionsOnItem(driver, home.moreButton());
		home.clickSellOnflipkart();
		//System.out.println(driver.getTitle());
		browserRelatedVerification.verifyTitle(driver.getTitle(), "Sell Online on Flipkart");
//		WaitForElements.waitForElmentsToBeClickable(driver, driver.findElement(By.xpath(TestUtility.elementLocator("SellOnFlipkart_PhoneNumberTextbox_xpath"))));
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		int i = 9;
		sellOnFlipkart.enterPhoneNumber("223456789"+i);
		sellOnFlipkart.clickRegisterButton();
		Thread.sleep(3000);

		while(elementRelatedVerification.messageExist(sellOnFlipkart.verifyPhoneRegisteredMessage(),
				"This phone number is already registered with us")==true) {
        
		i++;
		System.out.println(i);
		sellOnFlipkart.getTextPhoneNumber().clear();
		
		sellOnFlipkart.enterPhoneNumber("1234567891");
		sellOnFlipkart.clickRegisterButton();

//		System.out.println(driver.findElement(By.xpath("//div[text()='Can't check Number']")).getText());
		System.out.println(sellOnFlipkart.getTextPhoneNumber().getAttribute("value"));

		if(elementRelatedVerification.elementNotPresent(sellOnFlipkart.verifyPhoneRegisteredMessage())) {
			break;
		}
		
		}
	

		System.out.println(driver.getTitle());
		browserRelatedVerification.verifyTitle(driver.getTitle(), "Seller Dashboard");
		sellOnFlipkartRegistration.enterEmailAddress("abcd@gmail.com");
		sellOnFlipkartRegistration.enterOtp("12345");
		sellOnFlipkartRegistration.enterName("Gagan1");
		sellOnFlipkartRegistration.enterPassword("1234567890");
		elementRelatedVerification.elementEnabled(sellOnFlipkartRegistration.showButton());
		sellOnFlipkartRegistration.clickTermsOfUse();
		WaitForElements.waitForElmentsToBeClickable(driver, sellOnFlipkartRegistration.cancelButton());
		javascriptFunctions.verticalScroll();
		
	}
	}