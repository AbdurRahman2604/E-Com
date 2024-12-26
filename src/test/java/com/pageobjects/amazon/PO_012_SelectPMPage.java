package com.pageobjects.amazon;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_012_SelectPMPage extends A_Basepage{

	public PO_012_SelectPMPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//div[@data-a-input-name='ppw-instrumentRowSelection']")
List<WebElement> payment;	
		


	
public void payment() {
	for(WebElement btn:payment) {

		btn.click();
	}	
}
	
public void payment1() {
	for(int i=0;i<payment.size();i++) {
//		if(i==3) {
//			continue;
//		}
		payment.get(i).click();
	}
}
	
	
}
