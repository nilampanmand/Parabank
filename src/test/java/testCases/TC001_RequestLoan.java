package testCases;

import org.testng.annotations.Test;

import pageObjects.LogIn;
import pageObjects.RequestLoan;
import testBase.BaseClass;

public class TC001_RequestLoan extends BaseClass {
	
	
	@Test(groups={"Regression","Master"})
	public void acc_loan_request()
	{
		
		LogIn logi= new LogIn(driver);
		logi.SetLoginUsername(p.getProperty("username"));
		logi.SetLoginPassword(p.getProperty("password"));
		logi.SetClickLogin();
		
		RequestLoan lr=new RequestLoan(driver);
		lr.SetClickOnLoanReq();
		lr.SetReqLoanAmm("1000");
		lr.SetReqLoanDownPay("200");
		lr.SetReqFromAcc("1543");
		lr.SetReqClickaApply();

		
	}

	
}
