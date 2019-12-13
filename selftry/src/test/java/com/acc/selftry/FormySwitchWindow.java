package com.acc.selftry;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormySwitchWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://formy-project.herokuapp.com/");
		
		driver.findElement(By.linkText("Switch Window")).click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("alert-button")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		a.dismiss();
		
		driver.findElement(By.id("new-tab-button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		java.util.Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
			}
		
		driver.switchTo().window(mainWindow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(mainWindow);
		Thread.sleep(2000);
		
		driver.close();

	}

}
