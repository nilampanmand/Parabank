package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObjects.LogIn;
import testBase.BaseClass;

public class TC001_LoginDDT extends BaseClass {
	
	@SuppressWarnings("null")
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void login_DDT(String userna, String passw, String resl)
	{
	
		LogIn logi= new LogIn(driver);
		logi.SetLoginUsername(p.getProperty("username"));
		logi.SetLoginPassword(p.getProperty("password"));
		logi.SetClickLogin();
		
		logi.setLogout();
		
		String exp = null;
		if(exp.equalsIgnoreCase("Valid"))
		{
			Assert.assertTrue(true);
			logi.setLogout();
		}
	
	if(exp.equalsIgnoreCase("Invalid"))
	{
		logi.setLogout();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertTrue(true);
	}
	}
}
