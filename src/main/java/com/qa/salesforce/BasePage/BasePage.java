package com.qa.salesforce.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Nayana
 *
 */

//testing to see  the changes in github
public class BasePage {

	
	public WebDriver driver;
	public Properties prop;
	
	/**
	 * This method is used to initilize the driver on basis of browser
	 * @return this method returns webdriver instances
	 */
	
	public WebDriver initilize_driver() {
		
		String browser="chrome";
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   }
		else if(browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get("https://login.salesforce.com/");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;
	}

	/*
	 * public WebDriver notification_Block() { //Create a map to store preferences
	 * Map<String, Object> prefs = new HashMap<String, Object>();
	 * 
	 * //add key and value to map as follow to switch off browser notification
	 * //Pass the argument 1 to allow and 2 to block
	 * prefs.put("profile.default_content_setting_values.notifications", 2);
	 * 
	 * //Create an instance of ChromeOptions ChromeOptions options = new
	 * ChromeOptions();
	 * 
	 * // set ExperimentalOption - prefs options.setExperimentalOption("prefs",
	 * prefs);
	 * 
	 * return driver =new ChromeDriver (options); }
	 */
	/**
	 * This method is used to define the properties
	 * @return this method returns properties prop reference
	 */
	
	public Properties initilize_properties() {
		prop =new Properties();
		try {
			FileInputStream ip=new FileInputStream("C:\\Java_sourcecodefolder\\SalesForceOct2019\\src\\main\\java\\com\\qa\\salesforce\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
}
