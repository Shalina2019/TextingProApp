package Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class Screenshot {

	public static void takeSnapShot(WebDriver driver) throws IOException {

		// convert webdriver object to take screenshot
		//We are casting driver from webdriver object to takeScreenShot
		TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File srcfile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
        File destinationPath = new File("C:\\Selenium\\Nancy\\TextingProApp\\screenshots\\error_"+currentDateTime()+".png");
        
        //Copy file at destination
        FileUtils.copyFile(srcfile,destinationPath);
        
        
	}
	//To print error image 
	public static String currentDateTime () {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);

	}

}
