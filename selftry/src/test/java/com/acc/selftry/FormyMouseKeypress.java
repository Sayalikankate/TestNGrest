package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyMouseKeypress {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/");
		
		driver.findElement(By.linkText("Key and Mouse Press")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("name")).click();
		
		driver.findElement(By.id("name")).sendKeys("Sayali");
		
		driver.findElement(By.id("button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
