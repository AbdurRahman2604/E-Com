package com.testbase.amazon;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	public  static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MM_yy_HH_mm_ss"));
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination=new File(".\\screenshots\\Pass\\tname "+ new Listener().getClass() +"_"+timeStamp + ".png");
		source.renameTo(destination);
		
		
	}

	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		

		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yy_HH_mm_ss"));
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty(".\\screenshots\\Fail\\tname"+new Listener().getClass() +"_"+timeStamp + ".png");
		File destination=new File(destinationPath);
		source.renameTo(destination);
		
		
		
		
		
		
		
	}
	

	
		
		
		
		
	
	
	}

	


