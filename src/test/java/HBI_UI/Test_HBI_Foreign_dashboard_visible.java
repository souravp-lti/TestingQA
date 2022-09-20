package HBI_UI;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import ObjClass.Obj_HBI_Foreign_dashboard_visible;
import baseClass.browserSelection;

import utils.takeExcelData;


//@Listeners(testNGListener.customListenerClass.class)   //IMPORTANT TO KNOW WHEN TO GO FOR SCREENSHOT
public class Test_HBI_Foreign_dashboard_visible extends browserSelection{
	
	Obj_HBI_Foreign_dashboard_visible FELoginObj;
    Properties prop1 = new Properties();
    takeExcelData takeData = new takeExcelData();
    //ExtentReports extent;
	//ExtentTest test;
    
    
    SoftAssert softAssert = new SoftAssert();
    
    //--------------------------------------------extant----------------------------//
    
    @BeforeTest
	public void extentReport()
	{
		beforeTest();
	}
	
	@AfterTest
	public void endReport()
	{
		afterTest();
		driver.quit();
	}
	
	@AfterMethod
	public void exit(ITestResult result) throws IOException 
	{	
		afterMethod(result);
		
	}
	
	//--------------------------------------------extant-------------------------------//
    
    
	@Test(priority = 1)
    public void user_Launch_Chrome_browser() throws InterruptedException,IOException {
    	test = extent.startTest("user_Launch_Chrome_browser");
        initialization();   
    }
    
        
    @Test(priority = 2)
    public void user_opens_URL() throws IOException,InterruptedException {
    	
    	test = extent.startTest("user_opens_URL");
    	driver.get(takeData.readExcelFile("testData",1,1));
    	
    }

    @Test(priority = 3)
    public void user_clicks_on_login_Register_button() throws InterruptedException, IOException {
    	
    	test = extent.startTest("user_clicks_on_login_Register_button");
        FELoginObj = new Obj_HBI_Foreign_dashboard_visible();
        FELoginObj.clickLoginRegisterationButton();
       
    }

 
    @Test(priority = 4)
    public void user_selects_Foreign_Employer_and_clicks_on_Login_button() throws InterruptedException, IOException {
    	
    	test = extent.startTest("user_selects_Foreign_Employer_and_clicks_on_Login_button");
        FELoginObj.selectUserTypeAsFE();
        FELoginObj.clickOnUserTypePopupLogin();
        
    }

    @Test(priority = 5)
    public void user_enters_Healthcare_gmail_com_and_Healthcare() throws InterruptedException, IOException {
    	
    	test = extent.startTest("user_enters_Healthcare_gmail_com_and_Healthcare");
            //FELoginObj.setEmailID(readPropertyFile("userEmail"));
    	    FELoginObj.setEmailID(takeData.readExcelFile("testData",2,1));
 
            //FELoginObj.setPassword(readPropertyFile("password"));
    	    FELoginObj.setPassword(takeData.readExcelFile("testData",3,1));
            
            FELoginObj.clickOnLoginDashboard();   
            
            try{
	            boolean withoutEmailID = FELoginObj.proceedWithoutEmailID();
	            softAssert.assertEquals(withoutEmailID, false,"Cannot proceed without entering emailID");
            }
            
            catch(Exception e){
            	
            }
            
            try {
            	
	            boolean withoutPassw = FELoginObj.proceedWithoutPassword();
	            softAssert.assertEquals(withoutPassw, false,"Cannot proceed without entering Password");
            }
            catch(Exception e){
            	
            }
            
            try {
	            boolean withoutEmailPassw = FELoginObj.invalidUserIDPassword();
	            softAssert.assertEquals(withoutEmailPassw, false,"Invalid userID or Password");
            }
            
            catch(Exception e){
            	
            }
            
            try {
            	boolean validEmailID = FELoginObj.checkForValidUserID();
            	softAssert.assertEquals(validEmailID, false,"Entered invalid UserID");
            }
            
            catch(Exception e){
            	
            }
            softAssert.assertAll();
           
            
    }

    @Test(priority = 6)
    public void click_on_Login() throws InterruptedException {
    	
    	test = extent.startTest("click_on_Login");
        System.out.println("Able to click on Login button");       
       
    }

 
    @Test(priority = 7)
    public void dashboard_will_be_displayed() throws InterruptedException {
    	
    	test = extent.startTest("dashboard_will_be_displayed");
    	try {
        	boolean dashBoardDisplay = FELoginObj.dashboardIsDisplayed();
        	softAssert.assertEquals(dashBoardDisplay, true,"Dashboard Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
    	
        driver.quit();
        //System.out.println("closed");
        
    }
    
   
 
}
