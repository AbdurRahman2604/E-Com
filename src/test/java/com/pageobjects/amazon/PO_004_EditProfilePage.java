package com.pageobjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_004_EditProfilePage extends A_Basepage {

	public PO_004_EditProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[.='Your Account']")
	WebElement yourAcct;
	
	@FindBy(xpath="//h2[contains(text(),'Login & security')]")
	WebElement editProfile;
	@FindBy(id="NAME_BUTTON")
	WebElement editNameBtn;
	@FindBy(id="ap_customer_name")
	WebElement editName;
	@FindBy(id="cnep_1C_submit_button")
	WebElement saveBtn;
	

	public void yourAccountClick() {
		yourAcct.click();
	}
	
	public void editProfileclick() {
		editProfile.click();
	}
	public void editNameClick() {
		editNameBtn.click();
	}
	
	public void updateName() {
		editName.clear();
		editName.sendKeys("Abdur Rahman");
	}
	public void saveBtnClick() {
		saveBtn.click();
	}
}
