package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;

public class ContactUs extends BasePage {

	public ContactUs(WebDriver driver) {
		super(driver);
	}

	public void doContactUs() throws InterruptedException {
		SendKeys(By.id("name"), "testing");

		SendKeys(By.xpath("//input[@id='email']"), "email.com");
		SendKeys(By.xpath("//input[@id='sub']"), "testing");
		SendKeys(By.xpath("//textarea[@id='message']"), "I'm facing some issue");
		// click(By.xpath("//input[@class='services-link']"));

		Thread.sleep(2000);
		click(By.xpath("//input[@class='services-link']"));

	}

	public void acceptContactUsPopUp() {

		acceptPopUp();

	}

	public boolean verifyContactUsPopUpText() {

		if (getPopUpText().contains("Thank you")) {

			return true;
		}
		return false;
	}

}
