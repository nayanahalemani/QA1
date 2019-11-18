
		// TODO Auto-generated method stub
		package com.qa.salesforce.pages;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;

		import com.qa.salesforce.BasePage.BasePage;

		public class RememberMe_Part2 extends BasePage {
			
			//define locators /or-with By locator (NPF)
			
			WebDriver driver;

			By emailId=By.id("username");
			By password=By.id("password");
			By checkBox=By.id("rememberUn");
			By loginButton=By.id("Login");
			
			
					
					// constuructor of page class:"
					
					 public RememberMe_Part2(WebDriver driver){
						this.driver=driver; 
					 }
					 
				    // page actions:
					 
					 
					 
					

					public void clickCheckBox(String username, String pwd) {
						// TODO Auto-generated method stub
						driver.findElement(emailId).sendKeys(username);
						 driver.findElement(password).sendKeys(pwd);
						 driver.findElement(checkBox).click();
						  driver.findElement(loginButton).click();
					}
			
						  
					 }
			
					 
		

		

	

