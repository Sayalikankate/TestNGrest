package com.ethans.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	public WebDriver driver;
	public Actions action;

	@Test

	public void firstTest() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
		WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
		Thread.sleep(3000);
		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(3000);

	}

	@BeforeMethod

	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", AppConstants.chromeDriverLocation);
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");

	}

	@AfterMethod

	public void afterMethod() {
		driver.quit();
	}

}