package com.ethans.automation.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FirstTestNgClass {
	
  @Test
  public void test() {
	  System.out.println("This is my First Test Ng Test");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
