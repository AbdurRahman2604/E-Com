package com.testcases.amazon;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_002_SigninPage;
import com.pageobjects.amazon.PO_014_ReviewOrderPage;

public class TC014_ReviewOrder extends A_Browser_LQ {
	
	
	@Test
	public void review() throws InterruptedException, AWTException {
	
		PO_014_ReviewOrderPage rp=new PO_014_ReviewOrderPage(driver);
		rp.orders();
		PO_002_SigninPage si=new PO_002_SigninPage(driver);
		PO_002_SigninPage.email.sendKeys(properties.getProperty("mobileNo"));
		PO_002_SigninPage.ctnBtn.click();
		PO_002_SigninPage.pwd.sendKeys(properties.getProperty("password"));
		PO_002_SigninPage.signinSubmit.click();
		rp.review();
		rp.clear();
		Thread.sleep(5000);
		rp.star();
		rp.title();
		rp.addPhoto();
		rp.writeReview();
		rp.submitbtn();
		
		
	}

}
