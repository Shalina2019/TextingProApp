package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;
import CoreClasses.BaseTest;
import Utility.Screenshot;

public class MenuPage extends BasePage {

	public MenuPage(WebDriver driver) {
		super(driver);

	}

	public void ClickOnMenu(String menuname) throws InterruptedException, IOException {

		Thread.sleep(5000);

		click(By.xpath("//*[@id= 'cssmenu']//a[text()='" + menuname + "']"));

	}

}
