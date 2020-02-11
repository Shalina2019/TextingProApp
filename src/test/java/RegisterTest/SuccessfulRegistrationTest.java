package RegisterTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import CoreClasses.BaseTest;
import PageObject.MenuPage;
import PageObject.RegistrationPage;

public class SuccessfulRegistrationTest extends BaseTest {

	@Test
	public void VerifyRegistration() throws InterruptedException, IOException {

		MenuPage menupage = new MenuPage(BaseTest.driver);

		menupage.ClickOnMenu("Register");

		RegistrationPage registrationpage = new RegistrationPage(BaseTest.driver);
		Assert.assertTrue(registrationpage.VerifyTitleAndUrl(), "Registration Title  is not showing ");
		registrationpage.FillPersonalInfo();
		registrationpage.FillPersonalContactdetails();

		registrationpage.FillPassWordFields();

		registrationpage.SelectAllDropDown();

		registrationpage.ClickOnTermsAndCondition();

		registrationpage.ClickOnRegistrationButton();

	}

}

// Open Google Chrome
// Open Test.Textingpro website.
// Click on Register menu
// Verify use is on register page.
// Fill personal info fields.
// Fill personal contact details fields
// Fill passwords fields
// Select all dropdown
// Click on termandconditioncheckbox
// Click on register button
// User should be able to register successfully.
