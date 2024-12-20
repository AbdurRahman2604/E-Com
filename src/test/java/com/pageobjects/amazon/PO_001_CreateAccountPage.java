package com.pageobjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_001_CreateAccountPage extends A_Basepage {

	public PO_001_CreateAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id="ap_customer_name")
	WebElement fname;
	@FindBy(id="ap_phone_number")
	WebElement number;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="continue")
	WebElement verify;
	
	public void userName(String name) {
		fname.sendKeys(name);
		
	}
	public void no(String mobNo) {
		number.sendKeys(mobNo);
	}
	public void pwd(String pwd) {
		password.sendKeys(pwd);
	}
	public void btnVerify() {
		verify.click();
	}
	
	
	
	
}
