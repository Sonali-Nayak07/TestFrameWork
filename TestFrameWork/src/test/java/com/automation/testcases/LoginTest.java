package com.automation.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;

public class LoginTest extends BaseClass {
	
	@Test
	public void loginApp() throws InterruptedException, IOException
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.loginCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
	Helper.captureScreenshot(driver);
	
	}
	

}
