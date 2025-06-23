package testCases;

import org.testng.annotations.Test;


import pageObjects.LogIn;
import testBase.BaseClass;

public class TC001_AccountLogIn extends BaseClass {

	@Test(groups={"Sanity", "Master"})
	public void acc_login()
	{
		 
		LogIn logi= new LogIn(driver);
		logi.SetLoginUsername(p.getProperty("username"));
		logi.SetLoginPassword(p.getProperty("password"));
		logi.SetClickLogin();
		
		logi.setLogout();
		
	}
	
	
	
	
	
	
}
