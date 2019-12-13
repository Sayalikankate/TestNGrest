package com.ethans.automation.testng;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(priority = 1)

	public void SignIn() {

		System.out.println("This will execute second (SignIn)");

	}

	@Test(priority = 0)

	public void OpenBrowser() {

		System.out.println("This will execute first (Open Browser)");

	}

	@Test(priority = 2)

	public void LogOut() {

		System.out.println("This will execute third (Log Out)");

	}
}