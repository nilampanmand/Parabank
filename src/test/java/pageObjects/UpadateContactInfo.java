package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpadateContactInfo extends BasePage{

	public UpadateContactInfo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//a[normalize-space()='Update Contact Info']") WebElement ClickOnUpdateInfo;
	@FindBy(xpath="//input[@id='customer.firstName'] ") WebElement UpdateFirstName;
	@FindBy(xpath="//input[@id='customer.lastName']") WebElement UpdateLastNAme;
	@FindBy(xpath= "//input[@id='customer.address.street']") WebElement UpdateAddress;
	@FindBy(xpath= "//input[@id='customer.address.city']") WebElement UpdateCity;
	@FindBy(xpath= "//input[@id='customer.address.state']") WebElement UpdateState;
	@FindBy(xpath= "//input[@id='customer.address.zipCode']") WebElement UpdateZipcode;
	@FindBy(xpath= "//input[@id='customer.phoneNumber']") WebElement UpdatePhone;
	@FindBy(xpath= "//input[@value='Update Profile']") WebElement UpdateClick;
	
	
	
	public void SetClickOnUpInfo()
	{
		ClickOnUpdateInfo.click();
	}
	public void SetUFN(String ufn)
	{
		UpdateFirstName.sendKeys(ufn);
	}
	
	public void SetULN(String uln)
	{
		UpdateLastNAme.sendKeys(uln);
	}
	
	public void SetUAdd(String uadd)
	{
		UpdateAddress.sendKeys( uadd);
	}
	
	public void SetUCi(String uci)
	{
		UpdateCity.sendKeys( uci);
	}
	
	public void SetUSta(String ust)
	{
		UpdateState.sendKeys( ust);
	}
	
	public void SetUZip(String uzip)
	{
		UpdateZipcode.sendKeys( uzip);
	}
	
	public void SetUPhn(String uphn)
	{
		UpdatePhone.sendKeys( uphn);
	}
	
	public void SetUClick()
	{
		UpdateClick.click();
	}
	
	
}
