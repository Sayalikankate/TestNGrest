package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyEnableDisable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://formy-project.herokuapp.com/");
	//	driver.getPageSource();
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.linkText("Enabled and disabled elements")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement disabledbox= driver.findElement(By.id("disabledInput"));
		
		WebElement enabledbox= driver.findElement(By.id("input"));
		
		System.out.println("Given text box is enabled: "+ disabledbox.isEnabled());
		System.out.println("Given text box is enabled: "+ enabledbox.isEnabled());
		
		driver.close();
		
	}

}
