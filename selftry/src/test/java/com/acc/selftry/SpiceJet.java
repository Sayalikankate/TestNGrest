package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class SpiceJet {
	
	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.get("https://www.spicejet.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
  
 // #ctl00_mainContent_view_date2
  driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(3) > td:nth-child(7) > a")).click();
  
  Thread.sleep(3000);
  
  driver.close();
  

	}
}
