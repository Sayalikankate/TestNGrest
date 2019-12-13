package com.ethans.automation.testng;

import org.testng.annotations.Test;

public class TestNgGrouping {

	@Test(groups = { "Organization" })

	public void Organization1() {

		System.out.println("Batch Organization - Test Organization 1");

	}

	@Test(groups = { "Organization" })

	public void Organization2() {

		System.out.println("Batch Organization - Test Organization 2");

	}

	@Test(groups = { "Employee" })

	public void Employee1() {

		System.out.println("Batch Employee - Test Employee 1");

	}

	@Test(groups = { "Employee" })

	public void Employee2() {

		System.out.println("Batch Employee - Test Employee 2");

	}

	@Test(groups = { "Organization", "Non Profit Organization" })

	public void Tester() {

		System.out.println("Batch Tester - Test tester");

	}

}