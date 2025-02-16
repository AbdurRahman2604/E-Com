package com.pageobjects.amazon;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_002_SigninPage extends A_Basepage{

	public PO_002_SigninPage(WebDriver driver) {
		super(driver);
		
	}
	
@FindBy(name="email")
public static WebElement email;


@FindBy(id="continue")
public static WebElement ctnBtn;


@FindBy(name="password")
public static WebElement pwd;


@FindBy(id="signInSubmit")
public static WebElement signinSubmit;


@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
WebElement getUser;

@FindBy(xpath="//div[contains(text(),'Invalid mobile number')]")
WebElement invalidMobileNo;

@FindBy(xpath="//span[contains(text(),'Your password is incorrect')]")
WebElement getMsg;

@FindBy(id="continue")
WebElement getOtp;


@FindBy(id="cvf-input-code-container")
WebElement enterOtp;



@FindBy(xpath="//input[@aria-label='Verify OTP Button']")
WebElement verifyOtp;

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));// for tc-003



public void email(String emailId) {
	wait.until(ExpectedConditions.visibilityOf(email));
	email.sendKeys(emailId);
}
public void ctnButton() {
	wait.until(ExpectedConditions.visibilityOf(ctnBtn));
	ctnBtn.click();
}

public void password(String pwds) {
	wait.until(ExpectedConditions.visibilityOf(pwd));
	pwd.sendKeys(pwds);
}

public void submit() {
	wait.until(ExpectedConditions.visibilityOf(signinSubmit));
	signinSubmit.click();
}

public String getErrorMsg() {
	
	 
	        if (wait.until(ExpectedConditions.visibilityOf(getMsg)).isDisplayed()) {
	            return getMsg.getText();
	        } 
	    return "No error message displayed";
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
