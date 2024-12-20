package com.pageobjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class B_HomePage extends A_Basepage {

	public B_HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement signin;
	@FindBy(linkText = "Start here.")
	WebElement newCustomer;

	

	public void hoverOverSignin() {
		Actions action = new Actions(driver);
		action.moveToElement(signin).perform();
	}

	public void clickNewCustomer() {
		newCustomer.click();
	}
	
	public void signIn() {
		signin.click();
	}

}
