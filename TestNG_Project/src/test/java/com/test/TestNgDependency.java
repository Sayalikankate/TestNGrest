package com.test;

import org.testng.annotations.Test;

public class TestNgDependency {
	
	@Test
	public  void method1() {
		System.out.println("Method1");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods= "method1")
	public void method2() {
		System.out.println("Method2");
	}

}
