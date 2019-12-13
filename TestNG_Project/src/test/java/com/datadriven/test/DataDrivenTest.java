package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class DataDrivenTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Complete Web Form")).click();
		Thread.sleep(3000);
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> data=  TestUtil.getdatafromExcel();
		return data.iterator();
		
	}
	
	@Test(dataProvider = "getTestData")
	public void fillForm(String firstname,String lastname, String jobtitle, String date) {
		driver.findElement(By.id("first-name")).sendKeys(firstname);
		driver.findElement(By.id("last-name")).sendKeys(lastname);
		driver.findElement(By.id("job-title")).sendKeys(jobtitle);
		//driver.findElement(By.id("first-name"));
		driver.findElement(By.id("datepicker")).sendKeys(date);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
