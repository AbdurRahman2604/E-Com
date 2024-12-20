package com.listner.amazon;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.testcases.amazon.A_Browser_LQ;

public class Listener implements ITestListener {
	

	@Override
	public void onTestSuccess(ITestResult result) {
		   WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");

		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is passed");
		 A_Browser_LQ.screenShots(driver);
	}

	

}
