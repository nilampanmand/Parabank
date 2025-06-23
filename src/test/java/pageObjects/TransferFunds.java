package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFunds  extends BasePage{

	public TransferFunds(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//a[normalize-space()='Transfer Funds']") WebElement ClickFundTransferFromHomePage;
	@FindBy(xpath= "//input[@id='amount']") WebElement FundTransferAmm; 
	@FindBy(xpath= "//select[@id='fromAccountId']") WebElement  FundTransferFromAcc;
	@FindBy(xpath="//select[@id='toAccountId']") WebElement  FundTrasferToAcc; 
	@FindBy(xpath= "//input[@value='Transfer']") WebElement ClickOnFundTrasfer;
	
	public void SetClickFundTransferFromHomePage ()
	{
		ClickFundTransferFromHomePage.click();
	}
	
	public void SetFundTransferAmm(String fta )
	{
		FundTransferAmm.sendKeys(fta);
	}
	
	public void SetFundTransferFromAcc (String ftacc )
	{
		FundTransferFromAcc.sendKeys(ftacc);
	}
	
	public void SetFundTrasferToAcc (String fttacc)
	{
		FundTrasferToAcc.sendKeys(fttacc);
	}
	
	public void ClickOnFundTrasfer( )
	{
		ClickOnFundTrasfer.click();
	}
	
	
}
