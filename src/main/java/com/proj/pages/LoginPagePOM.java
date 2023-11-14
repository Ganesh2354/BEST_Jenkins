package com.proj.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.proj.base.BaseClass;

public class LoginPagePOM extends BaseClass{

	WebDriver ldriver;
	
	public LoginPagePOM(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='Jobseeker Login']")
	private WebElement loginBtn;	
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement userNameTab;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Enter your password']")
	private WebElement passwordTab;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn-primary loginButton']")
	private WebElement loginUserBtn;
	
	public void clickLoginBtn()
	{
		utils.click(ldriver, loginBtn, "loginBtn");
	}
	
	public void clickLoginUserBtn()
	{
		utils.click(ldriver, loginUserBtn, "loginUserBtn");
	}
	
	public void enterUserName()
	{
		utils.enterText(ldriver, userNameTab, "userNameTab", prop.getProperty("globalUserName"));		
	}
	
	public void enterPassword()
	{
	    utils.enterText(ldriver, passwordTab, "passwordTab", prop.getProperty("globalPassword"));
	}
}