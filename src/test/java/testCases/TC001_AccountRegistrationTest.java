package testCases;

import org.testng.annotations.Test;

import pageObjects.AccRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

@SuppressWarnings("rawtypes")
public class TC001_AccountRegistrationTest extends BaseClass {

	
	
	@Test(groups={"Regression","Master"})
	public void acc_registration()
	{

		HomePage hp= new HomePage(driver);
		hp.clickRegister();
		
		AccRegistrationPage rp=new AccRegistrationPage(driver);
		rp.setFN(randomeString().toUpperCase());
		rp.setLN(randomeString().toUpperCase());
		rp.setAdd(randomeString());
		rp.setCity(randomeString());
		rp.setState("maha");
		rp.setZipcode("410501");
		rp.setPhone("243123");
		rp.setSsn("23");
		rp.setUsername(randomeString());
		rp.setPassword("pp");
		rp.setConfirmPassword("pp");
		rp.setClickReg();
	}
	
		
	
	
	
	
//	public void tearDown()
//	{
	//	driver.quit();
	//}
		
		
	
}
