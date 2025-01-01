package com.testcases.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_001_CreateAccountPage;
import com.testbase.amazon.BaseClass;

public class TC001_CreateAccount extends BaseClass {
	
	
	
	
	@Test
	public void createAccount() {
		
		B_HomePage hp=new B_HomePage(driver);
		hp.hoverOverSignin();
		hp.clickNewCustomer();
		
		PO_001_CreateAccountPage ca=new PO_001_CreateAccountPage(driver);	
		ca.userName("raja");
		ca.no("1236549877");
		ca.pwd("123456");
		ca.btnVerify();
		
		
	}
	
	


}
