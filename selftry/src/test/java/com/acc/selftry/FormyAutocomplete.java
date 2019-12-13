package com.acc.selftry;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormyAutocomplete {

	public static void main(String[] args) throws Exception {
		
		//Step 1: Set driver location
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		
		//Step 2: Initialize driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	//depends on browser
		
		//Step 3: Hit URL
		driver.get("https://formy-project.herokuapp.com/");
		
		WebElement header= driver.findElement(By.className("display-3"));	//already explained
				
		
		System.out.println("Header Text: "+header.getText());
		System.out.println("Header Styling:");
		System.out.println("Font Size: "+ header.getCssValue("font-size")+" \t"+ "Font Color:"+ header.getCssValue("color")+" \t"+ "Font Family:"+ header.getCssValue("font-family") );
		System.out.println("Margin " + header.getCssValue("margin"));
		System.out.println("Background Color " + header.getCssValue("background-color"));
		
		//Similarly we can get line-height, font-weight
		
		
		
		
		WebElement autocomplete = driver.findElement(By.cssSelector("body > div > div > li:nth-child(5) > a"));	
		System.out.println("Font Size: "+ (autocomplete.getCssValue("font-size")+" \t"+ "Font Color: "+ autocomplete.getCssValue("color")));
		
		driver.findElement(By.linkText("Autocomplete")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Pune, Hadapsar");
		//("body > div > div > li:nth-child(5) > a")
		Thread.sleep(1000);		
		driver.close();

	}

}
