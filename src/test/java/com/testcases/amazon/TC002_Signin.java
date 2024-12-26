package com.testcases.amazon;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.Listener;
import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_002_SigninPage;



public class TC002_Signin extends A_Browser_LQ  {

@Test	
public void signinWithPropertyFile() {
	
	B_HomePage hp=new B_HomePage(driver);
	hp.signIn();
	
	PO_002_SigninPage si=new PO_002_SigninPage(driver);
	PO_002_SigninPage.email.sendKeys(properties.getProperty("mobileNo"));
	PO_002_SigninPage.ctnBtn.click();
	PO_002_SigninPage.pwd.sendKeys(properties.getProperty("password"));
	PO_002_SigninPage.signinSubmit.click();
	String expectedUser="Hello, Abdur";

	String actualUser = si.getUser();
	System.out.println(actualUser);
	
	Assert.assertEquals(actualUser,expectedUser,"user name doesnt match");
}


	
	

	
	
	
	
	
}


