package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;

public class NegativeLogin extends BasePage {

	public NegativeLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// public boolean verifytitleofloginpage() {
	//
	// }

	public void Loginfail() {
		SendKeys(By.id("userName"), "Test");
		// SendKeys(By.id("password"), "ywyuwuiw");
		// click(By.xpath("//button[@class='btn btn-rounded btn-orange btn-sign-up']"));
	}

	public void HitEnteronEmailaddress() {
		HitENTER(By.id("userName"));
	}

	public boolean verifyPLeaseEnterEmailAddressText() {
		// span[contains(text(),'Please enter a valid email address.')]
		String text = getText(By.xpath("//span[contains(text(),'Please enter a valid email address.')]"));
		if (text.contains("Please enter a valid email address.")) {
			return true;

		}
		return false;
	}

}
