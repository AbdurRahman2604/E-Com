package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.B_HomePage;
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
	ep.editNameClick();
	ep.updateName();
	ep.saveBtnClick();
	
	
	
	
}
	
	
	
}
