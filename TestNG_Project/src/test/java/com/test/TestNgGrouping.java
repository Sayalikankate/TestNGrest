package com.test;

import org.testng.annotations.Test;

public class TestNgGrouping {
	
	@Test(groups = "Search")
	public void metho1() {
		System.out.println("Method1");
	}
	
	@Test(groups = "Inbox")
	public void metho2() {
		System.out.println("Method2");
	}
	
	@Test(groups = "Search")
	public void metho3() {
		System.out.println("Method3");
	}
	
	@Test(groups = "New")
	public void metho4() {
		System.out.println("Method4");
	}
	
	@Test(groups = "Outbox")
	public void metho5() {
		System.out.println("Method5");
	}
	
	//helpful while report generation it would give report in the form of groups also

}
