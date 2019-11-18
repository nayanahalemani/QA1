package com.qa.salesforce.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.qa.salesforce.BasePage.BasePage;

public class LoginPage extends BasePage {
	
	//define locators /or-with By locator (NPF)
	
	WebDriver driver;

	By emailId=By.id("username");
	By userTextField=By.xpath("//input[@id='username']");
	By password=By.id("password");
	By loginButton=By.id("Login");
	 By checkBox=By.id("rememberUn");
	 By SFDCDropDownMenu=By.xpath("//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']//span[@class='uiImage']");
	 By Option1=By.linkText("Log Out");
	
			
			// constuructor of page class:"
			
			 public LoginPage(WebDriver driver){
				this.driver=driver; 
			 }
			 
		    // page actions:
			 
			 public String getLoginPageTitle() {
				 return driver.getTitle();
			 }
			 
			
	/*
	 * public void testId_1(String user1,String pwd1) {
	 * driver.findElement(emailId).sendKeys(user1);
	 * driver.findElement(password).clear();
	 * driver.findElement(loginButton).click(); }
	 */
			 
			 public void doLogin(String username,String pwd) {
				 driver.findElement(emailId).sendKeys(username);
				 driver.findElement(password).sendKeys(pwd);
				  driver.findElement(loginButton).click();
			 }
			 
			 
			 public void doRemLogin(String user,String pdw) throws AWTException  {
				  driver.findElement(emailId).sendKeys(user);
				  driver.findElement(password).sendKeys(pdw);
				  driver.findElement(checkBox).click();
				  driver.findElement(loginButton).click();
				  
				 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 Robot robot=new Robot();
				 try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 robot.mouseMove(353, 6);
				 try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				 
				 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
		  driver.findElement(SFDCDropDownMenu).click();
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(Option1).click();		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		String text=driver.findElement(emailId).getText();
		System.out.println(text);
		if(text.equals(user)) {
			System.out.println("username entered is correct");
		}
		else {
			System.out.println("user name is not correct");
		}
	    
}
			
}

