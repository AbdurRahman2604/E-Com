package com.pageobjects.amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_011_CheckOutPage extends A_Basepage {

	public PO_011_CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
WebElement address;
@FindBy(xpath="(//div[@data-a-input-name='ppw-instrumentRowSelection'])[6]")
WebElement cash;
@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
WebElement confirmPayment;

//PO_013

@FindBy(id="spc-gcpromoinput")
WebElement coupon;

@FindBy(xpath="//input[@aria-labelledby='gcApplyButtonId-announce']")
WebElement apply;

	
public void deliverAddress() {

	
	address.click();
}	

public void paymentByCash() {
	cash.click();
}
public void paymentConfirm() {
	confirmPayment.click();
}

public void couponCode() {
	coupon.sendKeys("COOL");
}

public void applyCoupon() {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click",apply);
	//apply.click();
}
}
