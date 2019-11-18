package com.qa.salesforce.tests;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.salesforce.BasePage.BasePage;
import com.qa.salesforce.pages.LoginPage;
//import com.qa.salesforce.pages.RememberMe_Part2;
//import com.qa.salesforce.pages.RememberMe_TC3;

public class LoginTest {

	WebDriver driver;
	BasePage basePage;
	LoginPage loginPage;
	
	
	@BeforeMethod
	public void setUp() {
		basePage=new BasePage();
		driver=basePage.initilize_driver();
		//driver=loginPage.notification_Block();
		loginPage=new LoginPage(driver);   
		
	}
	
	@Test(priority=1)
	public void loginTest() {
		loginPage.doLogin("salesinfo06-f3bm@force.com", "Smyrna123");
	}
	/* String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));*/
	
	@Test(priority=2)
	public void  checkBoxRem() throws AWTException {
	loginPage.doRemLogin("salesinfo06-f3bm@force.com", "Smyrna123");
		/*
		 * WebElement userField=driver.findElement(By.id("username")); String text=
		 * userField.getText(); System.out.println(text);
		 */
	//Assert.assertEquals(text, "salesinfo06-f3bm@force.com");
	}
	
	


	
}
