package com.pageobjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class A_Basepage {
	
	public static WebDriver driver;
	
	public A_Basepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
