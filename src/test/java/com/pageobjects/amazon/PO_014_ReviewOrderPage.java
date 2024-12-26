package com.pageobjects.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_014_ReviewOrderPage extends A_Basepage{

	public PO_014_ReviewOrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="(//span[@class='nav-line-2'])[2]")
WebElement orders;

@FindBy(linkText="Write a product review")
WebElement review;

@FindBy(xpath="//span[.='Clear']")
WebElement clear;

@FindBy(xpath="//img[@alt='select to rate item five star.']")
WebElement star;
	
@FindBy(id="scarface-review-title-label")
WebElement title;

@FindBy(xpath="//div[@aria-label='Add a photo or video']")
WebElement addPhoto;

@FindBy(id="scarface-review-text-card-title")
WebElement writeReview;

@FindBy(xpath="//button[contains(text(),'Submit')]")
WebElement submit;






public void orders() {
	orders.click();
}
	
public void review() {
	review.click();
}

public void clear() {
	clear.click();
}


public void star() {
	star.click();
}


public void title() {
	title.clear();
	title.sendKeys("cooker");
}

public void addPhoto() throws AWTException, InterruptedException {
	addPhoto.click();
	Thread.sleep(5000);
	String cooker="C:\\Users\\monap\\Downloads\\cooker.jpg";
	StringSelection urlCopy=new StringSelection(cooker);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(urlCopy, null);
	Thread.sleep(5000);
	//below code to paste url 
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}

public void writeReview() {
	writeReview.clear();
	writeReview.sendKeys("good quality");
}
public void submitbtn() {
	submit.click();
}
}
