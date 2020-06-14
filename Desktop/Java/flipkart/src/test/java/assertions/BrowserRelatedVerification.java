package assertions;

import org.junit.Assert;

public class BrowserRelatedVerification {

public BrowserRelatedVerification() {
}
	
	public void verifyUrl(String urlActual,String urlExpected) {
	Assert.assertTrue("URL is not correct", urlActual.equalsIgnoreCase(urlExpected));
		
	}

	public void verifyTitle(String titleActual,String titleExpected) {
	Assert.assertTrue("Title is not correct", titleActual.contains(titleExpected));
	}
}