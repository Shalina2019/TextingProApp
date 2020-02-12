package RegisterTest;

import org.testng.annotations.Test;

import CoreClasses.BaseTest;
import PageObject.WayToHomePage;

public class HandilingMulltipleWindows extends BaseTest {

	@Test
		public void verifyBUyNowButton() {
			WayToHomePage wt = new WayToHomePage(driver);
			
			wt.clickOnBuyNow(); 
					
				
			
	}
		
			
			

	
}
