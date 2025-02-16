package com.testbase.amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass  extends Listener{
	
	//public WebDriver driver;
	public Logger logger;
	public Properties properties;
	
	
	
	@BeforeClass
	//@Parameters({"os","browser"})
	public void launchBrowser() throws IOException { //String os,String br
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config.properties");
		properties = new Properties();
		properties.load(fis);
		
		
		
		logger=LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		
	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}
	
		
	@BeforeMethod
    public void resetState() {
        // Reset the page state for every test case
        driver.get(properties.getProperty("url")); // Reload the sign-in page
    }
		
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}

}
