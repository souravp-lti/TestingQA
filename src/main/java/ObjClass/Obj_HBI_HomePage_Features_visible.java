package ObjClass;


import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import baseClass.browserSelection;
import utils.takeExcelData;


public class Obj_HBI_HomePage_Features_visible extends browserSelection {
	
	//protected WebDriver driver;	 
	SoftAssert softAssert = new SoftAssert();
	takeExcelData takeData = new takeExcelData();
		
    
    public boolean homeButtonDisplayed() throws InterruptedException, IOException {
    	System.out.println(takeData.readExcelFile("Obj_HBI_HomePage_Features",1, 1));
    	//return driver.findElement(By.xpath(readHomePageData("homeButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",1, 1))).isDisplayed();    	
    }
    
    public boolean RecruitersDirectoryDisplayed() throws InterruptedException, IOException {
    	//return driver.findElement(By.xpath(readHomePageData("recruitersDirectoryButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",2, 1))).isDisplayed(); 
    }
    
    public boolean empDirectoryDisplayed() throws InterruptedException, IOException {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("employersDirectoryButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",3, 1))).isDisplayed(); 
    }
    
    public boolean aboutUsDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("aboutUsButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",4, 1))).isDisplayed(); 
    }
    
    public boolean faqDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("fAQdropdown"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",5, 1))).isDisplayed(); 
    }
    
    public boolean contactUsDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("contactUsButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",6, 1))).isDisplayed(); 
    }
    
    public boolean dashboardButtonDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("dashboardButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",7, 1))).isDisplayed(); 
    }
    
    public boolean GrievanceDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("grievanceButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",8, 1))).isDisplayed(); 
    }
    
    public boolean searchHeakthcareDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("searchHealthcareTextbox"))).isDisplayed(); 
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",9, 1))).isDisplayed(); 
    }
    
    public boolean searchButtonDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("searchButton"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",10, 1))).isDisplayed(); 
    }
    
    public boolean regdProfNumDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("registeredProfessionalsNumber"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",11, 1))).isDisplayed(); 
    }
    
    public boolean docNumDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("doctorsNumber"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",12, 1))).isDisplayed(); 
    }
    
    public boolean nursesNumberDisplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("nursesNumber"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",13, 1))).isDisplayed(); 
    }
    
    public boolean otherRegdNumDsiplayed() throws InterruptedException, IOException{
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//return driver.findElement(By.xpath(readHomePageData("otherRegistrationNumber"))).isDisplayed();
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_HomePage_Features",14, 1))).isDisplayed(); 
    }



}



