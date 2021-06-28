package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	@Before
	public void OpenBrowser() {
		//open blank browser
	System.setProperty("Webdriver.chrome.driver", "/Users/jubaerhosen/Downloads/chromedriver");
		driver= new ChromeDriver();
		// navigate to Url
		driver.get("http://www.express.com");
		
	}

	
	@After
	public void CloseBrowser() {
		driver.quit();
		
	}
	
	// my first java push to the github,
	
	
}
