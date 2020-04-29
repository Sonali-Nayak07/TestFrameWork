package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.Browser;
import com.automation.utilities.Helper;

public class BaseClass {
	 public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=Browser.startApplication(driver,"Chrome","https://ui.freecrm.com/");
	}
	
   @AfterClass
   
	   public void closebrowser()
	   {
		  Browser.quitBrowser(driver);
	   }
	   
	   @AfterMethod
	   public void tearDownMethod(ITestResult result) throws IOException
	   {
		   if (
				   result.getStatus()==ITestResult.FAILURE) {
			   Helper.captureScreenshot(driver);
		   }
	   }
   
}
