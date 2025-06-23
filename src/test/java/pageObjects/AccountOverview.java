package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountOverview extends BasePage {

	public AccountOverview(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="//a[normalize-space()='Accounts Overview']") WebElement ClickOnAccOverview;
	
	public void SetClickOnAccOverview()
	{
		ClickOnAccOverview.click();
	}

}





