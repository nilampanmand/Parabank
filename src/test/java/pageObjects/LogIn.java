package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends BasePage{

	public LogIn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='username']")  WebElement loginUsername;
	@FindBy(xpath="//input[@name='password']")   WebElement loginPassword;
	@FindBy(xpath= "//input[@value='Log In']") WebElement clickLogin;
	
	@FindBy(xpath="//a[normalize-space()='Log Out']") WebElement clickLogout;
	
	public void SetLoginUsername(String lun)
	{
		loginUsername.sendKeys(lun);
	}
	
	public void SetLoginPassword(String lp)
	{
		loginPassword.sendKeys(lp);
	}
	
	public void SetClickLogin()
	{
		clickLogin.click();
	}

	public void setLogout()
	{
		clickLogout.click();
	}
}

