package com.acc.selftry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FormyDragDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/");
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.linkText("Drag and Drop")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div/form/div")));
		
		
		
		WebElement sourceLocator = driver.findElement(By.id("image"));
		WebElement targetLocator = driver.findElement(By.id("box"));
		
		Thread.sleep(3000);
		
		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
