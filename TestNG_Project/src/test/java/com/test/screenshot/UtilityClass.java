//package com.test.screenshot;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//public class UtilityClass {
//	
//	WebDriver driver;
//
//	public void failedScreenshot() {
//		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(image, new File("C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\TestNG_Project\\screenshots"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}
