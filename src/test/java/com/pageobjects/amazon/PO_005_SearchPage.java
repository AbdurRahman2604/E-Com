package com.pageobjects.amazon;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_005_SearchPage extends A_Basepage{

	public PO_005_SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(id="twotabsearchtextbox")
WebElement searchBox;

//PO_006
//@FindBy(xpath="//span[contains(@class,'a-size-base a-color-base')]")
//List<WebElement> checkBoxLabels;

@FindBy(xpath="//a[@aria-label='Apply the filter Bata to narrow results']")
WebElement bataCheckBox;

@FindBy(xpath="//span[@class='a-size-base-plus a-color-base']")
WebElement verifyFilter;
	
@FindBy(xpath="//input[@type='checkbox']")
List<WebElement> checkBoxes;
public void search() {
	searchBox.sendKeys("Shoe",Keys.ENTER);
}
	
public void checkBoxClick() {
	bataCheckBox.click();
}
	
public String verifyFilterProduct() {
	return verifyFilter.getText();
}


/*public void checkBox(String Bata) {
	
	for(WebElement checkBox:checkBoxLabels) {
		String text = checkBox.getText();
		
		if(text.equals(Bata)) {
			checkBox.click();
		}
		break;
	}
}*/
	
}
