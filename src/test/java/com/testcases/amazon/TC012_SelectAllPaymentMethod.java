package com.testcases.amazon;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_002_SigninPage;
import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_007_ProductDetailsVerifyPage;
import com.pageobjects.amazon.PO_011_CheckOutPage;
import com.pageobjects.amazon.PO_012_SelectPMPage;

public class TC012_SelectAllPaymentMethod extends A_Browser_LQ {

	
@Test	
public void radio() throws InterruptedException {
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
	
	PO_012_SelectPMPage sp=new PO_012_SelectPMPage(driver);
	sp.payment1();
}
}
    

