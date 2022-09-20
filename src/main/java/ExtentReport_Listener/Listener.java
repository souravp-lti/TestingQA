package ExtentReport_Listener;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseClass.browserSelection;
import utils.captureScreeShot;


public class Listener implements ITestListener
{
	 protected ExtentReports extent;
	 protected ExtentTest test;
	 
	public void beforeTest()
	{
		extent = new ExtentReports("C:\\\\Users\\\\USER\\\\eclipse-workspace\\\\ABDM_Automation_Script.v.2\\\\EXTENT_REPORT"+"\\\\ExtentReport.html", true);
		//extent = new ExtentReports(brSel.readPropertyFile("extentReportPath")+"\\\\ExtentReport.html", true);		
		extent.addSystemInfo("Host Name", "ENVY-HP");
		extent.addSystemInfo("User Name", "Sourav");
		extent.addSystemInfo("Environment", "QA");
		extent.addSystemInfo("OS", "Windows");
	}
	
	public void afterTest()
	{
		extent.flush();
		extent.close();
	}
	
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("TEST CASE FAILED");
			test.log(LogStatus.FAIL, "TEST CASE FAILED IS " +result.getName());
			test.log(LogStatus.FAIL, "TEST CASE ERROR IS " +result.getThrowable()); // to add error and exception to extent report
			
			String screeshotPath = captureScreeShot.failedTCSS(result.getName());;
			test.log(LogStatus.FAIL, test.addScreenCapture(screeshotPath)); // to add screenshot to extent report
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS " +result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(LogStatus.PASS, "TEST CASE PASSED IS " +result.getName());
		}
		
		extent.endTest(test); // ending the test and current test and prepare html report
		
	}
	
	 	

}
