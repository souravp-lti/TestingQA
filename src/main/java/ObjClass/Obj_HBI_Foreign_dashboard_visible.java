package ObjClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseClass.browserSelection;

import utils.takeExcelData;

public class Obj_HBI_Foreign_dashboard_visible extends browserSelection {
		 
	SoftAssert softAssert = new SoftAssert();
	takeExcelData takeData = new takeExcelData();
	
	
    public void clickLoginRegisterationButton() throws InterruptedException, IOException {    
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",2, 1))).click();
    }
    
    public void selectUserTypeAsFE() throws InterruptedException, IOException {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//driver.findElement(By.xpath(readForeDashData("selectUserTypeFE"))).click();
    	driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",3, 1))).click();
    }
    
    public void clickOnUserTypePopupLogin() throws InterruptedException, IOException {
        
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",4, 1))).click();
    }
     
    public void setEmailID(String email) throws InterruptedException, IOException {
     
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElement(By.id(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",5, 1))).clear();
    	driver.findElement(By.id(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",5, 1))).sendKeys(email);
    }
    
    public boolean checkForValidUserID() throws InterruptedException, IOException {
 
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",6, 1))).isDisplayed();
    }
    
    public boolean proceedWithoutEmailID() throws InterruptedException, IOException {
    
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",7, 1))).isDisplayed();
    }
    
    public void setPassword(String pass) throws InterruptedException, IOException {
     
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElement(By.id(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",8, 1))).clear();
    	driver.findElement(By.id(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",8, 1))).sendKeys(pass);
    }
    
    public boolean proceedWithoutPassword() throws InterruptedException, IOException {
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",9, 1))).isDisplayed();
    }
    
    public void clickOnLoginDashboard() throws InterruptedException, IOException {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",10, 1))).click();
    }
    
    public boolean invalidUserIDPassword() throws InterruptedException, IOException {
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",11, 1))).isDisplayed();
   
    }
    
    public boolean dashboardIsDisplayed() throws InterruptedException, IOException {
 
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	return driver.findElement(By.xpath(takeData.readExcelFile("Obj_HBI_Foreign_dashboard",12, 1))).isDisplayed();
    }



}



