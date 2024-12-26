package com.pageobjects.amazon;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_005_SearchPage extends A_Basepage{

	public PO_005_SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//PO_005
@FindBy(id="twotabsearchtextbox")
WebElement searchBox;

//PO_006

@FindBy(xpath="//a[@aria-label='Apply the filter Bata to narrow results']")
WebElement bataCheckBox;

@FindBy(xpath="//span[@class='a-size-base-plus a-color-base']")
WebElement verifyFilter;

//PO_007
@FindBy(partialLinkText="8216 Boss-Grip Black Derby Shoes for Men")
WebElement productClick;


public void search() {
	searchBox.sendKeys("Shoe",Keys.ENTER);
}
	
public void checkBoxClick() {
	bataCheckBox.click();
}
	
public String verifyFilterProduct() {
	return verifyFilter.getText();
}


public void selectProduct() {
	productClick.click();
}



public void handleNewWindow() {
    String parentWindow = driver.getWindowHandle();
    Set<String> allWindows = driver.getWindowHandles();

    for (String window : allWindows) {
        if (!window.equals(parentWindow)) {
            driver.switchTo().window(window);
            break;
        }
    }
    // Add a wait to ensure the new window is fully loaded
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(driver -> driver.getTitle() != null && !driver.getTitle().isEmpty());
}


public String getProductTitle() {
    return driver.getTitle(); // Example action on the new window
}


/*@FindBy(xpath="//span[contains(@class,'a-size-base a-color-base')]")
List<WebElement> checkBoxLabels;

@FindBy(xpath="//input[@type='checkbox']")
List<WebElement> checkBoxes;

public void checkBox(String Bata) {
	
	for(WebElement checkBox:checkBoxLabels) {
		String text = checkBox.getText();
		
		if(text.equals(Bata)) {
			checkBox.click();
		}
		break;
	}
}*/


	
}
