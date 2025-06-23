package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class BaseClass {

public   WebDriver driver;
public Properties p;	
	
	
	@BeforeClass(groups={"Sanity","Regression","Master"})
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException 
	{
		
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p= new Properties();
		p.load(file);
	
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("Linvalid name.."); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}


public String randomeString()
{
	@SuppressWarnings("deprecation")
	String genstr= RandomStringUtils.randomAlphabetic(5);
	return genstr;
}

public String randomeNumber()
{
	
	@SuppressWarnings("deprecation")
	String gennum= RandomStringUtils.randomNumeric(10);
	return gennum;
}

public String randomAlphaNumberic()
{
	
	@SuppressWarnings("deprecation")
	String genstr= RandomStringUtils.randomAlphabetic(5);
	@SuppressWarnings("deprecation")
	String gennum= RandomStringUtils.randomNumeric(10);
	return (genstr+"@"+gennum);
}

//@AfterClass(groups= {"sanity","Regression","Master"})
// public void tearDown()
 // {
	// driver.quit();
//}
	
	
	
}


