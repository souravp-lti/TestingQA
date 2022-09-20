package HBI_UI;

import java.io.IOException;
import java.util.Properties;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ObjClass.Obj_HBI_Foreign_dashboard_visible;
import ObjClass.Obj_HBI_HomePage_Features_visible;
import baseClass.browserSelection;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.takeExcelData;


//@Listeners(testNGListener.customListenerClass.class)   //IMPORTANT TO KNOW WHEN TO GO FOR SCREENSHOT
public class Test_HBI_HomePage_Features_Visible extends browserSelection {

	Obj_HBI_HomePage_Features_visible homePageObj;
    Properties prop1 = new Properties();
    SoftAssert softAssert = new SoftAssert();
    takeExcelData takeData = new takeExcelData();
    
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
    public void user_Launch_Chrome() throws InterruptedException,IOException {
    	test = extent.startTest("user_Launch_Chrome");
        initialization();    
    }
    
        
    @Test(priority = 2)
    public void user_opens_the_URL() throws IOException,InterruptedException {
    	test = extent.startTest("user_opens_the_URL");
    	driver.get(takeData.readExcelFile("testData",1,1));
    }

    @Test(priority = 3)
    public void homeButton_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("homeButton_will_be_displayed");
    	
    	try {
        	boolean homeButtonDisplay = homePageObj.homeButtonDisplayed();
        	System.out.println();
        	softAssert.assertEquals(homeButtonDisplay, true,"Home Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 4)
    public void recruitersDir_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("recruitersDir_will_be_displayed");
    	
    	try {
        	boolean recDirButtonDisplay = homePageObj.RecruitersDirectoryDisplayed();
        	softAssert.assertEquals(recDirButtonDisplay, true,"Recruiters directory Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 5)
    public void empDir_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("empDir_will_be_displayed");
    	
    	try {
        	boolean empDirButtonDisplay = homePageObj.empDirectoryDisplayed();
        	softAssert.assertEquals(empDirButtonDisplay, true,"Emp directory Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 6)
    public void abtUs_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("abtUs_will_be_displayed");
    	
    	try {
        	boolean aboutUsDisplay = homePageObj.aboutUsDisplayed();
        	softAssert.assertEquals(aboutUsDisplay, true,"About Us Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 7)
    public void faq_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("faq_will_be_displayed");
    	
    	try {
        	boolean faqButtonDisplay = homePageObj.faqDisplayed();
        	softAssert.assertEquals(faqButtonDisplay, true,"FAQ Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 8)
    public void contactUs_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("contactUs_will_be_displayed");
    	
    	try {
        	boolean contactUsDisplay = homePageObj.contactUsDisplayed();
        	softAssert.assertEquals(contactUsDisplay, true,"Contact Us Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 9)
    public void dashboardButton_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("dashboardButton_will_be_displayed");
    	
    	try {
        	boolean dashboardDisplayed = homePageObj.dashboardButtonDisplayed();
        	softAssert.assertEquals(dashboardDisplayed, true,"Dashboard Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 10)
    public void grievanceButton_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("grievanceButton_will_be_displayed");
    	
    	try {
        	boolean grienavenceButtonDisplay = homePageObj.GrievanceDisplayed();
        	softAssert.assertEquals(grienavenceButtonDisplay, true,"Greivance Button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 11)
    public void health_care_textbox_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("health_care_textbox_will_be_displayed");
    	
    	try {
        	boolean searchTextbixDisplay = homePageObj.searchHeakthcareDisplayed();
        	softAssert.assertEquals(searchTextbixDisplay, true,"Search textbox Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 12)
    public void search_button_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("search_button_will_be_displayed");
    	
    	try {
        	boolean searchbuttonDisplayed = homePageObj.searchButtonDisplayed();
        	softAssert.assertEquals(searchbuttonDisplayed, true,"Search button Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 13)
    public void regd_prof_num_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("regd_prof_num_will_be_displayed");
    	
    	try {
        	boolean regdProfNumDisplay = homePageObj.regdProfNumDisplayed();
        	softAssert.assertEquals(regdProfNumDisplay, true,"Registered proffesional number Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 14)
    public void doc_num_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("doc_num_will_be_displayed");
    	
    	try {
        	boolean docNoDisplay = homePageObj.docNumDisplayed();
        	softAssert.assertEquals(docNoDisplay, true,"Doctor number Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 15)
    public void nurse_num_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("nurse_num_will_be_displayed");
    	
    	try {
        	boolean nurseNumDisplay = homePageObj.nursesNumberDisplayed();
        	softAssert.assertEquals(nurseNumDisplay, true,"Nurses number Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }
    
    @Test(priority = 16)
    public void other_regd_num_will_be_displayed() throws InterruptedException {
    	test = extent.startTest("other_regd_num_will_be_displayed");
    	
    	try {
        	boolean otherRegdNumDisplay = homePageObj.otherRegdNumDsiplayed();
        	softAssert.assertEquals(otherRegdNumDisplay, true,"Other Registeration Not displayed");
        }
        
        catch(Exception e){
        	
        }
    	
    	softAssert.assertAll();
        driver.quit();
        
    }

 
}
