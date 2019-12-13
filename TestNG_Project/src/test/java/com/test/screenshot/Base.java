package com.test.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com");

	}
	
	public void failedScreenshot(String methodname) {
		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(image, new File("C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\TestNG_Project\\screenshots\\testfailure.jpg"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//above code will overwrite as one image with same name gets created
		
		try {
			FileUtils.copyFile(image, new File("C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\TestNG_Project\\screenshots\\"+ "failshot_"+this.getClass().getName()+"_"+methodname));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
