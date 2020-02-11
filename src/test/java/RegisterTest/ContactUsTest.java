package RegisterTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import CoreClasses.BaseTest;
import PageObject.ContactUs;
import PageObject.MenuPage;

@Test

public class ContactUsTest extends BaseTest {

	public void verifyContactUsPage() throws InterruptedException, IOException {
		MenuPage menupage = new MenuPage(BaseTest.driver);
		menupage.ClickOnMenu("Contact Us");

		ContactUs contactus = new ContactUs(BaseTest.driver);
		contactus.doContactUs();
		Thread.sleep(2000);
		if (contactus.verifyContactUsPopUpText()) {
			System.out.println("contact us message displays");

		} else {
			System.out.println("Test failed: contact us message is not displayed");
			Assert.assertTrue(false);
		}

		Thread.sleep(2000);
		contactus.acceptPopUp();
	}

}

// Contact Us Form:- Open test.textingpro website.
// 2) Click on the Constact Us menu.
// 3) fill all contact us form all fields.
// 4) Click on send button.
// 5) Verify “Thank you ” message of javascript pop
// 6) Click ok on that message.
