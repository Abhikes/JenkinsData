package com.Hybrid.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PomObject.LoginActi;


public class BaseTest {
	public static WebDriver driver;
	public DataDriven d = new DataDriven();
	//@Parameters("browser")
	
	@BeforeClass
	public void openurl()throws Throwable
	{
		//if(browser.equals("chrome"))
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QSPJSP\\eclipse-workspace\\Maven003\\src\\main\\resources\\chromedriver.exe");
		    driver = new ChromeDriver();
		
			/*
			 * if(browser.equals("firefox")) { System.setProperty("webdriver.gecko.driver",
			 * "C:\\Users\\QSPJSP\\eclipse-workspace\\ExpData\\src\\browsers\\geckodriver.exe"
			 * ); driver = new FirefoxDriver();
			 * 
			 * }
			 */
		
		driver.get(d.keyDriven("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void login() throws Throwable
	{
		LoginActi t = new LoginActi(driver);
		
		//driver.findElement(By.id("username")).sendKeys(d.keyDriven("un"),Keys.TAB,d.keyDriven("pw"),Keys.ENTER);
	    t.loginMethod(d.keyDriven("un"),d.keyDriven("pw"));
	}
	
	
	
	
	
	@AfterMethod
	public void logout() throws Throwable
	{
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
