package PomObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActi {
	@FindBy (id="username")
	 private WebElement un;
	@FindBy (name="pwd")
	private WebElement pw;
	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement login;
	public WebElement getUn() {
		return un;
	}
	public LoginActi(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	
	}
	
	public WebElement getPw() {
		return pw;
	}
	public WebElement getLogin() {
		return login;
	}
   //
	public void loginMethod(String data,String data1)
    {
    	un.sendKeys(data);
    	pw.sendKeys(data1);
    	login.click();
        
        
    }
	/*
	 * public void password(String data) { pw.sendKeys(data); } public void login()
	 * { login.click(); }
	 */
}
