package com.pageobjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_002_SigninPage extends A_Basepage{

	public PO_002_SigninPage(WebDriver driver) {
		super(driver);
		
	}
	
@FindBy(id="ap_email")
public static WebElement email;


@FindBy(id="continue")
public static WebElement ctnBtn;


@FindBy(id="ap_password")
public static WebElement pwd;


@FindBy(id="signInSubmit")
public static WebElement signinSubmit;


@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
WebElement getUser;



@FindBy(id="continue")
WebElement getOtp;


@FindBy(id="cvf-input-code-container")
WebElement enterOtp;



@FindBy(xpath="//input[@aria-label='Verify OTP Button']")
WebElement verifyOtp;

public void email(String emailId) {
	email.sendKeys(emailId);
}
public void ctnButton() {
	ctnBtn.click();
}

public void password(String pwds) {
	pwd.sendKeys(pwds);
}

public void submit() {
	signinSubmit.click();
}

public String getUser() {
	return getUser.getText();

}


public void otpGet() {
	getOtp.click();
}
	
public void enterOtp(String otp) {
	enterOtp.sendKeys(otp);
}

public void verify() {
	verifyOtp.click();
}

}
