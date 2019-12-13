package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicsTest {
	
	//before suite
	//before test
	//before class
	//before method

  @BeforeClass
  public void enterURLTest() {
    System.out.println("URL entered");
  }

  @BeforeTest
  public void launchBrowserTest() {
    System.out.println("Browser Launched");
  }

  @BeforeMethod
  public void loginTest() {
    System.out.println("Method tested");
  }
  
  @Test
  public void testbelow() {
	  System.out.println("-------------------");
  }
}
