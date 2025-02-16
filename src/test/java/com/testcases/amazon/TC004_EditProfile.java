package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_002_SigninPage;
import com.pageobjects.amazon.PO_004_EditProfilePage;
import com.testbase.amazon.BaseClass;

public class TC004_EditProfile extends BaseClass{

@Test
public void	editName() {
	
	
	B_HomePage hp=new B_HomePage(driver);
	hp.hoverOverSignin();
	
	PO_004_EditProfilePage ep=new PO_004_EditProfilePage(driver);
	ep.yourAccountClick();
	ep.editProfileclick();
	PO_002_SigninPage si=new PO_002_SigninPage(driver);
	PO_002_SigninPage.email.sendKeys(properties.getProperty("mobileNo"));
	PO_002_SigninPage.ctnBtn.click();
	PO_002_SigninPage.pwd.sendKeys(properties.getProperty("password"));
	PO_002_SigninPage.signinSubmit.click();
	
	ep.editNameClick();
	ep.updateName();
	ep.saveBtnClick();
	
	
	
	
}
	
	
	
}
