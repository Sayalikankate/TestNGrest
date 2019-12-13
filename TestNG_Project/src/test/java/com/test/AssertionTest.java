package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	SoftAssert softassert = new SoftAssert();
	
	//hard assertion: hard validation: if a hard assertion is getting failed--> immediately testcase will be marked as fail and test case will be terminated
	//soft assertion: soft validation: if a soft assertion is getting failed--> test case will not be marked as failed as well as next line will be executed
	//assertAll(): to mark the test case as failed, if any soft assertion is failed
	
	@Test
	public void test1() {
		System.out.println("Open Browser");
		
		System.out.println("Enter Username");
		
		System.out.println("Enter Password");
		
		softassert.assertEquals(false, true);
		
		System.out.println("validate home page");
		
		softassert.assertEquals(false, true, "Title missing"); 
		
		System.out.println("Create contacts");
		
		
		softassert.assertAll();
		
		//soft Assert will allow to execute rest of the steps without blocking
		//if in case fails we can print a statement next to it
		//if assertAll is not entered the test case will be passsed
		//if we enter assertAll in @AfterClass then it would get fail and method which should be failed will be passed, which is wrong way
		
	}

}
