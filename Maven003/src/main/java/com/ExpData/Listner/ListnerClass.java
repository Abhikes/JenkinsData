package com.ExpData.Listner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Hybrid.generic.BaseTest;
//import com.geniric.BaseTest;
import com.google.common.io.Files;

public class ListnerClass implements ITestListener {

	//@Override
	public void onTestStart(ITestResult result) {
	  Reporter.log("Test Case Number"+result.getName()+"started",true);	
	
	}

	//@Override
	public void onTestSuccess(ITestResult result) {
		 Reporter.log("Test Case Number"+result.getName()+"Executed",true);	
			
	}

	//@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh = (TakesScreenshot)BaseTest.driver;
		File src = sh.getScreenshotAs(OutputType.FILE);
		File dist=new File("D:\\Selenium\\SceenShot\\"+result.getName()+".png");
        try {
			Files.copy(src, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
  