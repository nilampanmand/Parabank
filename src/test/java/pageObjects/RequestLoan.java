package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RequestLoan extends BasePage {

	public RequestLoan(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Request Loan']") WebElement ClickOnLoanRequest;
	@FindBy(xpath="//input[@id='amount']") WebElement ReqLoanAmmount;
	@FindBy(xpath="//input[@id='downPayment']") WebElement ReqLoanDownPaymant;
	@FindBy(xpath= "//select[@id='fromAccountId']") WebElement ReqLoanFromAcc;
	@FindBy(xpath= "//input[@value='Apply Now']") WebElement ReqLoanClickApply;
	
	
	public void SetClickOnLoanReq()
	{
		ClickOnLoanRequest.click();
	}
   public void SetReqLoanAmm(String la)
   {
	   ReqLoanAmmount.sendKeys(la);
   }
   
   public void SetReqLoanDownPay(String dp)
   {
	   ReqLoanDownPaymant.sendKeys(dp); 
   }
   
   public void SetReqFromAcc(String fa)
   {
	   ReqLoanFromAcc.sendKeys(fa); 
   }
   
   public void SetReqClickaApply()
   {
	   ReqLoanClickApply.click();
   }
}




