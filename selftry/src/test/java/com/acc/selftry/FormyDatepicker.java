package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyDatepicker {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/");
		driver.findElement(By.linkText("Datepicker")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#datepicker")).click();
		
		//driver.findElement(By.cssSelector("//*[@id=\"datepicker\"] "));
		
		//driver.findElement(By.cssSelector("//*[text()=\"21\"]"));
		///html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]
		//driver.findElements(By.cssSelector("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='22']")).get(0).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//tr[4]/td[7]")).click();
		Thread.sleep(1000); 
		
		driver.close();
		
	}

}
