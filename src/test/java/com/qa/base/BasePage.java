package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public WebDriver initDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/");
		return driver;
	}

}
