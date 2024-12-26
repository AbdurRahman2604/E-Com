package com.testcases.amazon;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A_Browser_LQ {
	
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	public void launchBrowser(ITestContext context) throws IOException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		context.setAttribute("WebDriver", driver); // Pass driver to ITestContext
		loadProperties();
	}
	
	public static Properties properties;
	
	public Properties loadProperties() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Eclipse_GroTechMInd\\E-Com\\src\\test\\resources\\config.properties");
		properties = new Properties();
		properties.load(fis);
		return properties;
	}

	
	
	public static  File screenShots(WebDriver driver) {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yy_HH_mm_ss"));
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Eclipse_GroTechMInd\\E-Com\\screenshots\\Pass\\TC002_" + timeStamp + ".png");
		source.renameTo(destination);
		return destination;
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
