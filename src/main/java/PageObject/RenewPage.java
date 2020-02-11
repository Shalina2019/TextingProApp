package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;
import CoreClasses.BaseTest;
import Utility.Screenshot;

public class RenewPage extends BasePage {

	public RenewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyUserOnRenewPage() throws IOException {
		String text = getText(By.xpath("//a[contains(text(),'Renew Now')]"));
		if (text.contains("Renew Now")) {
			return true;

		}
		return false;
	}
}

// public class RenewPage extends BasePage {
//
// public RenewPage(WebDriver driver) {
// super(driver);
//
// }
//
// public boolean verifyUserOnRenewPage() {
//
// String text = getText(By.xpath("//a[contains(text(),'Renew Now')]"));
//
// if (text.contains("Renew")) {
//
// return true;
// }
// return false;
//
//
// }
//
//
// }
