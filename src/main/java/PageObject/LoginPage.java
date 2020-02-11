package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public void doLogin() {
		SendKeys(By.id("userName"), "shalinanabi3@gmail.com");
		SendKeys(By.id("password"), "123456");
		click(By.xpath("//button[@class='btn btn-rounded btn-orange btn-sign-up']"));
	}

	// public void doubleClickOnUserNsame() {
	// doubleClick(By.xpath("//span[@class='username']"));
	public void doubleClickOnUserNsame() {
		doubleClick(By.xpath("//span[@class='username']"));

	}

	public void ClickOnUserName() {
		click(By.xpath("//span[@class='username']"));

	}

	public void ClickOnSignOut() {
		click(By.xpath("//a[contains(text(),'Log Out')]"));

	}

	public boolean VerifyTitleAndURL() {
		String Title = GetTitleOfCurrentPage();
		System.out.println(Title);
		if (Title.contains("Login")) {
			return true;
		}
		return false;
	}
}
