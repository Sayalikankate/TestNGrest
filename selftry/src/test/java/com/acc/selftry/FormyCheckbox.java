package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyCheckbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/");
		driver.findElement(By.linkText("Checkbox")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		WebElement checked1 = driver.findElement(By.cssSelector("#checkbox-1"));
		checked1.click();
		
		WebElement checked2 = driver.findElement(By.id("checkbox-2"));
		//checked2.click();
		
		System.out.println("Checkbox 1 is selected or not? "+ checked1.isSelected());
		System.out.println("Checkbox 2 is selected or not? "+ checked2.isSelected());
		Thread.sleep(1000);
		driver.close();

	}

}
