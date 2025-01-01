package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_002_SigninPage;
import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_007_ProductDetailsVerifyPage;
import com.pageobjects.amazon.PO_011_CheckOutPage;
import com.testbase.amazon.RetryAnalyzer;
import com.testbase.amazon.BaseClass;

public class TC013_ApplyCouponCode extends BaseClass{
	
	
	@Test(retryAnalyzer =com.testbase.amazon.RetryAnalyzer.class)
	public void couponCode()  {
		PO_005_SearchPage search = new PO_005_SearchPage(driver);

		search.search();
		search.checkBoxClick();
		search.selectProduct();

		search.handleNewWindow();
		
		PO_007_ProductDetailsVerifyPage pp=new PO_007_ProductDetailsVerifyPage(driver);
		pp.addToCart();
		pp.proceedTCO();
		
		PO_002_SigninPage si=new PO_002_SigninPage(driver);
		PO_002_SigninPage.email.sendKeys(properties.getProperty("mobileNo"));
		PO_002_SigninPage.ctnBtn.click();
		PO_002_SigninPage.pwd.sendKeys(properties.getProperty("password"));
		PO_002_SigninPage.signinSubmit.click();
		
		PO_011_CheckOutPage cp=new PO_011_CheckOutPage(driver);
		cp.deliverAddress();
		
		cp.paymentByCash();
		cp.paymentConfirm();
		cp.couponCode();
		
		cp.applyCoupon();
		
		
	}

}
