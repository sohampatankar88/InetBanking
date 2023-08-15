package com.inetBanking.testCases;

import org.junit.Assert;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void LoginTest() throws Exception{
		driver.get(baseURL);
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered username");
		lp.setPassword(passWord);
		logger.info("Entered password");
		Thread.sleep(2000);
		lp.ClickBtn();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);	
			logger.info("Login test passed");
		}else
		{
			captureScreen(driver,"LoginTest" );
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
	
	
}
