package com.qa.salesforce.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.salesforce.BasePage.BasePage;

public class RememberMe_TC3 extends BasePage {
	//define locators /or-with By locator (NPF)
	
		WebDriver driver;

	
	  By emailId=By.id("username"); 
	  By pwd=By.id("password");
	  By checkBox=By.id("rememberUn"); 
	  By loginButton=By.id("Login");
	  By usermenu=By.id("userNav"); 
	  By logOut=By.id("Logout");
	  
	  // constuructor of page class:"
	  
	  public RememberMe_TC3 (WebDriver driver)
	  { 
		  this.driver=driver;
	  }
	  
	  // page actions:
	  
	  
	  public void doRemLogin(String username,String password) {
	  driver.findElement(emailId).sendKeys(username);
	  driver.findElement(pwd).sendKeys(password);
	  driver.findElement(checkBox).click();
	  driver.findElement(loginButton).click();
	  
	  /*try { Thread.sleep(6000); } catch
	  (InterruptedException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); } driver.findElement(loginButton).click();
	  
	  
	  } public String error_Message( ) {
	  
	  
	  String notSelected="Remember me is not selected",
	  selected="Remember me is selected..";
	  
	  if( driver.findElement(checkBox).isSelected()) {
	  System.out.println(selected); return notSelected; } else {
	  System.out.println(selected); return selected; }
	  
	  }
	 */
	  }
}
