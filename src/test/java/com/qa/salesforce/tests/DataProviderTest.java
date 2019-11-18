package com.qa.salesforce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.salesforce.BasePage.BasePage;
import com.qa.salesforce.pages.LoginPage;

public class DataProviderTest {
	By emailId=By.id("username");
	By userTextField=By.xpath("//input[@id='username']");
	By password=By.id("password");
	By loginButton=By.id("Login");
	
	WebDriver driver;
	BasePage basePage;
	LoginPage loginPage;
	
	
	@BeforeMethod
	public void setUp() {
		basePage=new BasePage();
		driver=basePage.initilize_driver();
		loginPage=new LoginPage(driver);   
		
	}
	
	 @Test(dataProvider="LoginInfo")
	    public void testMethod(String user,String passwordd) throws InterruptedException{
	    {
	    driver.findElement(emailId).sendKeys(user);
	   //  Thread.sleep(3000);
	    driver.findElement(password).sendKeys(passwordd);
	    driver.findElement(loginButton).click();
	   Thread.sleep(3000);
	       
	    }
	    }

	    @DataProvider(name="LoginInfo")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "nayana", "nayana1" },
	            { "nayana1", "nayana12" },
	            { "nayana2", "nayana123" },
	            { "nayana3", "nayana1234" },
	            { "nayana4", "nayana12345" },
	            { "nayana5", "nayana123456" },
	            { "nayana6", "nayana12345467"},
	            { "nayana7", "nayana12345678" },
	            { "nayana8", "nayana123456789" },
	            { "nayana9", "nayana12345678910"},
	            { "nayana10", "nayana1234567891011"},
	        };

	    }
	    
	    @AfterMethod
	    public void TearDown() {
			driver.close();
		}
	    
}
