package com.qa.salesforce.tests;

import org.testng.annotations.Test;

public class TestngnPriority {

	@Test(priority=1)
	public void m1() {
		System.out.println("m1");
	}
	@Test(priority=-1)
	public void m2() {
		System.out.println("m2");
	}
	@Test(priority=0)
	public void m3() {
		System.out.println("m3");
	}
	@Test(priority=-5)
	public void m4() {
		System.out.println("m4");
	}
	@Test(priority=-3)
	public void m5() {
		System.out.println("m5");
	}
	@Test()
	public void M6() {
		System.out.println("m6");
	}
	/*
	 * @Test() public void 7m() { System.out.println("m1"); }
	 */

}
