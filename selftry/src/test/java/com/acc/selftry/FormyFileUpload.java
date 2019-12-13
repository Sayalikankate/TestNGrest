package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://formy-project.herokuapp.com/");
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.linkText("File Upload")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement uploadfile= driver.findElement(By.id("file-upload-field"));
		
		uploadfile.sendKeys("C:\\Users\\sayali.sunil.kankate\\Links");
		
		driver.close();

	}

}
