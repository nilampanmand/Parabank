package testCases;

import org.testng.annotations.Test;

import pageObjects.LogIn;
import pageObjects.TransferFunds;
import testBase.BaseClass;

public class TC001_Transfer_Funds extends BaseClass {



   @Test(groups={"Regression","Master"})
   public void acc_Funds_Transfer()
   {
	
	   LogIn logi= new LogIn(driver);
		logi.SetLoginUsername(p.getProperty("username"));
		logi.SetLoginPassword(p.getProperty("password"));
		logi.SetClickLogin();
		
		TransferFunds ft=new TransferFunds(driver);
		ft.SetClickFundTransferFromHomePage();
		ft.SetFundTransferAmm("1200");
		ft.SetFundTransferFromAcc("1234");
		ft.SetFundTrasferToAcc("4563");
		ft.ClickOnFundTrasfer();
	   
	   
	   
	
	   
    }




}