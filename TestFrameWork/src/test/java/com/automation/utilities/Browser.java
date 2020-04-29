package com.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL) {
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		 	driver = new ChromeDriver();
		}
	
	
	else
		System.out.println("we donot support this browser");
	driver.manage().window().maximize();
	driver.get(appURL);
	return driver;
	}
	
    public static  void quitBrowser(WebDriver driver)
    {
    	driver.quit();
    	
    }
}
