package com.qa.salesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	/*Before Suit, After Suit
	 * before test,After Test
	 * Before Class After Class
	 * Before Method, After Method
	 * Test1  & Test2
	 * 
	 */
	@BeforeSuite
	public void methodm1() {
		System.out.println("I am Before Suit: methodm1");
	}
	
	@BeforeTest
	public void methodm2() {
		System.out.println("i am BeforeTest: methodm2");
	}
	
	@BeforeClass
	public void methodm3() {
		System.out.println("i am Before Class:method3");
	}
	
	@BeforeMethod
	public void methodm4() {
		System.out.println(" I am before Method: methodm4");
	}
	
	@Test
	public void Test1() {
		System.out.println("i am @test: Test1");
	}
	@Test
	public void Test2() {
		System.out.println("i am @test: Test2");
	}
	@AfterSuite
	public void methodm5() {
		System.out.println("I am AfterSuit: methodm1");
	}
	
	@AfterTest
	public void methodm6() {
		System.out.println("i am AfterTest: methodm2");
	}
	
	@AfterClass
	public void methodm7() {
		System.out.println("i am AfterClass:method3");
	}
	
	@AfterMethod
	public void methodm8() {
		System.out.println(" I am AfterMethod: methodm4");
	}
	

}
