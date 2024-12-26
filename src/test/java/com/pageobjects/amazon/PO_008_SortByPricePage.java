package com.pageobjects.amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PO_008_SortByPricePage extends A_Basepage {

	public PO_008_SortByPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
@FindBy(id="s-result-sort-select")
WebElement sortByDD;

public void select() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",sortByDD);
	//sortByDD.click();
	
	
	Select select=new Select(sortByDD);
	select.selectByIndex(2);
	System.out.println("Option selected successfully");	
	} 
	

}
