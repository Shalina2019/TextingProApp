package RegisterTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import CoreClasses.BaseTest;
import PageObject.RenewPage;
import PageObject.LoginPage;
import PageObject.MenuPage;

public class SuccessfulLoginTest extends BaseTest {

	@Test
	public void VerifyLoginpage() throws InterruptedException, AWTException, IOException {

		MenuPage menupage = new MenuPage(BaseTest.driver);

		menupage.ClickOnMenu("Log In");
		
		
		LoginPage loginpage = new LoginPage(BaseTest.driver);
		// Assert.assertTrue(loginpage.VerifyUserUserIsInRenewPage(),"Successfully lands
		// on Renew page");
		loginpage.doLogin();
		
		//Implimenting Robot Class
		Robot R = new Robot();
		R.mouseMove(630, 420);
		R.keyPress(KeyEvent.VK_ENTER);

		RenewPage dashboardpage = new RenewPage(BaseTest.driver);
		if (dashboardpage.verifyUserOnRenewPage()) {
			System.out.println("Test case pass");

		} else {
			System.out.println("test case failed ");

			Assert.assertTrue(false, "Test Case failed because user did't redirect to Renew Page");

		}

		Thread.sleep(4000);

		// loginpage.doubleClickOnUserNsame();
		loginpage.ClickOnUserName();
		loginpage.ClickOnUserName();
	}
}
