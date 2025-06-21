package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccRegistrationPage extends BasePage {

	public AccRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
@FindBy(xpath= "//input[@id='customer.firstName']") WebElement firstName;
@FindBy(xpath= "//input[@id='customer.lastName']") WebElement lastName;
@FindBy(xpath= "//input[@id='customer.address.street']" ) WebElement address;
@FindBy(xpath= "//input[@id='customer.address.city']" ) WebElement city;
@FindBy(xpath= "//input[@id='customer.address.state']" ) WebElement state;
@FindBy(xpath= "//input[@id='customer.address.zipCode']" ) WebElement zipCode;
@FindBy(xpath=  "//input[@id='customer.phoneNumber']") WebElement phoneNumber;
@FindBy(xpath= "//input[@id='customer.ssn']" ) WebElement ssn;
@FindBy(xpath=  "//input[@id='customer.username']") WebElement userName;
@FindBy(xpath= "//input[@id='customer.password']" ) WebElement password;
@FindBy(xpath=  "//input[@id='repeatedPassword']") WebElement  confirmPassword;
@FindBy(xpath= "//input[@value='Register']" ) WebElement clickReg;

public void setFN(String fn)
{
	firstName.sendKeys(fn);
}

public void setLN(String ln)
{
	lastName.sendKeys(ln);
}
	
public void setAdd(String ad)
{
	address.sendKeys(ad);
}

public void setCity(String c)
{
	city.sendKeys(c);
}
public void setState(String s)
{
	state.sendKeys(s);
}
public void setZipcode(String z)
{
	zipCode.sendKeys(z);
}
public void setPhone(String ph)
{
	phoneNumber.sendKeys(ph);
}
public void setSsn(String sn)
{
	ssn.sendKeys(sn);
}
public void setUsername(String un)
{
	userName.sendKeys(un);
}
public void setPassword(String p)
{
	password.sendKeys(p);
}
public void setConfirmPassword(String cp)
{
	confirmPassword.sendKeys(cp);
}
public void setClickReg()
{
	clickReg.click();
}


}
