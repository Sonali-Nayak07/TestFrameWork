package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver Idriver;

	public LoginPage(WebDriver driver)
	{
		this.Idriver=driver;
	}
	@FindBy(xpath="//a[@href='https://ui.freecrm.com']") WebElement loginbutton;
	@FindBy(xpath="//input[@name='email']") WebElement usernameapp;
	@FindBy(xpath="//input[@name='password']") WebElement passwordapp;
	@FindBy(xpath="//div[contains(@class, 'ui fluid large blue submit button') and contains(., 'Login')]") WebElement clicklogin;
	
	public void loginCRM(String uname,String pass) throws InterruptedException
	{
		
		//loginbutton.click();
		usernameapp.sendKeys(uname);
		Thread.sleep(2000);
		passwordapp.sendKeys(pass);
		Thread.sleep(2000);
		clicklogin.click();
		Thread.sleep(6000);
	}
	
}
