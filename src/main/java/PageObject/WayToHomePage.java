package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CoreClasses.BasePage;

public class WayToHomePage extends BasePage {

	public WayToHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnBuyNow() {
		click(By.xpath(
				"//div[@class='btn-group margin_top_53']//a[@class='btn btn-danger'][contains(text(),'BUY NOW')] "));

	}

}
