package com.proj.tests;

import org.testng.annotations.Test;

import com.proj.base.BaseClass;
import com.proj.pages.LoginPagePOM;
import com.proj.utilities.CaptureScreenShot;

public class TC001_NaukriLogin extends BaseClass {
	LoginPagePOM lppom;

	@Test
	public void loginNaukri() throws Exception {

		lppom = new LoginPagePOM(driver);
		lppom.clickLoginBtn();
		Thread.sleep(5000);
		lppom.enterUserName();
		Thread.sleep(3000);
		lppom.enterPassword();
		Thread.sleep(3000);
		lppom.clickLoginUserBtn();
		Thread.sleep(3000);
		CaptureScreenShot.getScreenShotOfPage(driver, "Login Naukri");
		System.out.println("Screenshot captured and stored: " + CaptureScreenShot.getscreenshotPath());
		Thread.sleep(7000);
		// Screenshot ---> Name ---> AfterLoginPage

	}

}