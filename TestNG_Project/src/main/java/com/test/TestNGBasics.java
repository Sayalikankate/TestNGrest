package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
	//before suite
	//before test
	//before class
	//before method
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Chrome Launched");
		
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("URL Entered");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Logged in");
	}

}
