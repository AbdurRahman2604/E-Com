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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	public Properties properties;
	
	
	
	@BeforeMethod
	@Parameters({"os","browser"})
	public void launchBrowser(String os,String br,ITestContext context) throws IOException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config.properties");
		properties = new Properties();
		properties.load(fis);
		
		
		
		logger=LogManager.getLogger(this.getClass());
		
		
		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		default:System.out.println("Invalid browser name");
		return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}
	
		
	public String  screenShots(String tname) {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yy_HH_mm_ss"));
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("D:\\Eclipse_GroTechMInd\\E-Com\\screenshots\\Pass" +tname+"_"+timeStamp + ".png");
		File destination=new File(destinationPath);
		source.renameTo(destination);
		return destinationPath;
		
	}
		
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
