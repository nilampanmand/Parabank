package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager implements ITestListener {

        ExtentReports extent;
        ExtentTest test;
        
        @Override
        public void onStart(ITestContext context )
        {
        	ExtentSparkReporter spark= new ExtentSparkReporter(System.getProperty("user.dir") +"/Parabank/target/reports.html");
        	spark.config().setReportName("Parabank Automation Report");
        	spark.config().setDocumentTitle("Parabank test execution");
        	
        	extent= new ExtentReports();
        	extent.attachReporter(spark);
        	extent.setSystemInfo("Enviroment", "QA");
        	extent.setSystemInfo("Tester", "TD");
        	extent.setSystemInfo("OS", System.getProperty("os.name"));
        	extent.setSystemInfo("Browser", "chrome");
        	
        	
        }

        public void onTestStart(ITestListener result)
        {
        	test=extent.createTest(((ITestResult) result).getMethod().getMethodName())
        			.assignAuthor("TD")
        			.assignCategory("smoke")
        			.assignDevice("chrome");
        	test.info("Test Started"+((ITestResult) result).getMethod().getMethodName());
        			
        }
        
        @Override
        public void onTestSuccess(ITestResult result)
        {
        	test.pass("Test has pass");
        	
        	
        }
        
        @Override
        public void onTestFailure(ITestResult result)
        {
        
        	
        	//Object driver = null;
		//	if(driver!=null)
     //   	{
        		//try {
        			//System.out.println("diver logic");
        		//}catch (NoSuchSessionException e) {
        		//	System.out.println("driver session close");
        	//	}
        	//}
        	//test.fail(result.getThrowable());
        	
        }
        
        @Override
        public void onFinish(ITestContext context)
        {
        	extent.flush();
        }
        
        
    
}