package PomObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actiloginpom {
	WebDriver driver;
	@Test
	public void loginactitime()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QSPJSP\\eclipse-workspace\\ExpData\\src\\browsers\\chromedriver.exe");
	     driver= new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    LoginActi t = new LoginActi(driver);
		t.loginMethod("admin", "manager");
	   
	}

}
