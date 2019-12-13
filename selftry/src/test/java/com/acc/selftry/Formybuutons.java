package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formybuutons {

	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/");
		
		
		
		driver.findElement(By.linkText("Buttons")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("body > div > form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-primary")).submit();
		
		System.out.println("Primary button size: "+ driver.findElement(By.cssSelector("body > div > form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-primary")).getSize());
		//gives size
		//similarly getWidth(), getHeight()
		
		
		driver.findElement(By.cssSelector("body > div > form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-success")).submit();
		
		driver.findElement(By.cssSelector("body > div > form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-link")).submit();
		
		Thread.sleep(1000);
		
		//Select val = new Select(driver.findElement(By.id("btnGroupDrop1")));
		//val.selectByVisibleText("Dropdown link 1");
		
		driver.findElement(By.id("btnGroupDrop1")).click();
		
		Thread.sleep(5000);
		
		
		driver.close();

	}

}
