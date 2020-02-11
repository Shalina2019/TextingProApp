package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;

public class ContactUsEmail_PoPUp extends BasePage {

	public ContactUsEmail_PoPUp(WebDriver driver) {
		super(driver);

	}

	public void clickOnContactUsWidget() throws InterruptedException {

		Thread.sleep(3000);

		click(By.xpath(
				"//div[@class='purechat-collapsed-outer purechat-display-block']//span[@class='purechat-widget-title-link'][contains(text(),'Contact us')]"));

	}

	public void fillEmailUsForm() throws InterruptedException {

		SendKeys(By.id("purechat-firstname-input"), "Shalina");
		SendKeys(By.id("purechat-lastname-input"), "Nabi");
		SendKeys(By.id("purechat-email-input"), "Shalina.nabi@gmail.com");
		SendKeys(By.id("purechat-phonenumber-input"), "7132205409");
		SendKeys(By.id("purechat-company-input"), "Amazing Deals");
		SendKeys(By.id("purechat-question-input"), "why cant i login with my credentials ");

		Thread.sleep(2000);

	}

	public void clickOnSendEmail() {

		click(By.id("purechat-name-submit"));

	}

	public boolean verifyEmailSqureBoxAppearrs() {
		String Text = getText(
				By.xpath("//div[@class='purechat-enterinfo-container purechat-email-success purechat-card']"));
		System.out.println(Text);

		if (Text.contains("shows all the information in a box")) {

			return true;

		}

		return false;

	}

}
