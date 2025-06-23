package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountOverview;
import pageObjects.LogIn;
import testBase.BaseClass;

public class TC001_AccountOverview extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void acc_overview()
	{
		
		LogIn logi= new LogIn(driver);
		logi.SetLoginUsername(p.getProperty("username"));
		logi.SetLoginPassword(p.getProperty("password"));
		logi.SetClickLogin();
		
		AccountOverview ao=new AccountOverview(driver);
		ao.SetClickOnAccOverview();
	}
	
	

}
