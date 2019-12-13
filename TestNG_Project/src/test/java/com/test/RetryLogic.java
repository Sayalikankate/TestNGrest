package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic {
	
	@Test(retryAnalyzer = com.test.RetryAnalyzer.class)
	public void method1 () {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void method2 () {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void method3 () {
		Assert.assertEquals(true, true);
	}
	
//	@Test(retryAnalyzer = com.test.RetryAnalyzer.class)
//	public void method1 () {
//		Assert.assertEquals(true, false);
//	}
	
	//now above method is not required since we have RetryTransformer Class and testng.xml is also edited accordingly
}
