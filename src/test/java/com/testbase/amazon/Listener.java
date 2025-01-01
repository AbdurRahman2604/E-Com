package com.testbase.amazon;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	

	@Override
	public void onTestSuccess(ITestResult result) {
		 
		
		
		String screenShot = new BaseClass().screenShots(result.getName());
		
	
	
	}

	

}
