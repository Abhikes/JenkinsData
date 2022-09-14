package com.ExpData.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Hybrid.generic.BaseTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import com.geniric.BaseTest;
@Listeners(com.ExpData.Listner.ListnerClass.class)
public class TestCase1 extends BaseTest {
	@Test()
	public void tc1() throws IOException, Throwable
	{
		driver.findElement(By.id("container_tasks")).click();
	}

}
 