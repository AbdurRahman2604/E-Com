package com.testcases.amazon;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.Listener;
import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_002_SigninPage;
import com.testbase.amazon.BaseClass;



public class TC002_Signin extends BaseClass  {

@Test	
public void signinWithPropertyFile() {
	
	logger.info("*****Starting TC002_Signin*****" );
	
	try {
		B_HomePage hp=new B_HomePage(driver);
		hp.signIn();
		
		logger.info("*****clicked on signin button from home page*****" );
		
		PO_002_SigninPage si=new PO_002_SigninPage(driver);
		PO_002_SigninPage.email.sendKeys(properties.getProperty("mobileNo"));
		PO_002_SigninPage.ctnBtn.click();
		PO_002_SigninPage.pwd.sendKeys(properties.getProperty("password"));
		PO_002_SigninPage.signinSubmit.click();
		
		logger.info("*****clicked on signin after passing valid credentials*****" );
		logger.info("*****validating actual and expected message*****" );
		
		String expectedUser="Hello, Abdur";

		String actualUser = si.getUser();
		System.out.println(actualUser);
		if(actualUser.equals(expectedUser)) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("test failed");
			logger.debug("debug logs");
			Assert.assertTrue(false);
			
			
		}
		
		//Assert.assertEquals(actualUser,expectedUser,"user name doesnt match");
		
	} catch (Exception e) {
		
		Assert.fail();
	}
	
	logger.info("*****Test completed TC002_Signin*****" );
	
	
}


	
	

	
	
	
	
	
}


