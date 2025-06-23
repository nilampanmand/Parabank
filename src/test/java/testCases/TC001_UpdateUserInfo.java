package testCases;

import org.testng.annotations.Test;

import pageObjects.LogIn;
import pageObjects.UpadateContactInfo;
import testBase.BaseClass;

public class TC001_UpdateUserInfo extends BaseClass{

	@Test(groups={"Regression","Master"})
	public void acc_update_info()
	{
		
		LogIn logi= new LogIn(driver);
		logi.SetLoginUsername(p.getProperty("username"));
		logi.SetLoginPassword(p.getProperty("password"));
		logi.SetClickLogin();
		
		
		UpadateContactInfo uci = new UpadateContactInfo(driver);
		uci.SetClickOnUpInfo();
		uci.SetUFN(randomeString().toUpperCase());
		uci.SetULN(randomeString().toUpperCase());
		uci.SetUAdd(randomeString().toUpperCase());
		uci.SetUCi(randomeString().toUpperCase());
		uci.SetUSta(randomeString().toUpperCase());
		uci.SetUZip(randomeString().toUpperCase());
		uci.SetUPhn(randomeString().toUpperCase());
		uci.SetUClick();
		
		
		
		
		
	}
	
	
	
	
	
	
}
