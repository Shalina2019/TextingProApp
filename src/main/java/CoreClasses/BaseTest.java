package CoreClasses;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Screenshot;

public class BaseTest {

	public static WebDriver driver;
	
	//Calling browser and website

	@BeforeTest
	public void openBrowser() {
		
		PropertyConfigurator.configure("log4j.properties");


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		// open Chrome Browser
		driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();
  
		
		OpenWebsiteURL();
	}

	public void OpenWebsiteURL() {
		driver.get("https://test.textingpro.com");

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		System.out.println(result.getStatus());
		if(result.getStatus()==2) {
		Screenshot.takeSnapShot(driver);
		}
	}
}
