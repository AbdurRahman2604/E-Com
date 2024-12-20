package com.testcases.amazon;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.Listener;
import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_002_Signin;



public class TC002_Signin extends A_Browser_LQ  {

@Test	
public void signinWithPropertyFile() {
	
	B_HomePage hp=new B_HomePage(driver);
	hp.signIn();
	
	PO_002_Signin si=new PO_002_Signin(driver);
	PO_002_Signin.email.sendKeys(properties.getProperty("mobileNo"));
	PO_002_Signin.ctnBtn.click();
	PO_002_Signin.pwd.sendKeys(properties.getProperty("password"));
	PO_002_Signin.signinSubmit.click();
	
}
@Test(enabled=false)
public void signin() {
	B_HomePage hp=new B_HomePage(driver);
	hp.signIn();
	
	PO_002_Signin si=new PO_002_Signin(driver);
	si.email("9600255247");
	si.ctnButton();
	si.password("123");
	si.submit();
	String expectedUser="Hello, Abdur";

	String actualUser = si.getUser();
	System.out.println(actualUser);
	
	Assert.assertEquals(actualUser,expectedUser,"user name doesnt match");
}

	
	

	
	
	
	
	
}


