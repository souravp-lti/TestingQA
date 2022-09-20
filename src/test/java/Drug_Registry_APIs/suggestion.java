package Drug_Registry_APIs;

import java.io.IOException;
import java.util.Properties;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClass.browserSelection;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.takeExcelData;

public class suggestion extends browserSelection{
	SoftAssert softAssert = new SoftAssert();
	Properties prop1 = new Properties();
	takeExcelData useData = new takeExcelData();
	
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
		
	}
	
	@AfterMethod
	public void exit(ITestResult result) throws IOException 
	{	
		afterMethod(result);
		
	}
	
	//--------------------------------------------extant-------------------------------//
	
	@Test
	void suggestionSearchTextBox() throws IOException {
		//System.out.print(useData.readExcelFile("Drug_Registry_API_Data", 1, 1));
		test = extent.startTest("suggestionSearchTextBox");
		RestAssured.baseURI = useData.readExcelFile("Drug_Registry_API_Data", 1, 1);
		
		RequestSpecification typeOfRequest = RestAssured.given();
		
		typeOfRequest.relaxedHTTPSValidation();
		
		//Response response = typeOfRequest.request(Method.GET,readPropertyFile("suggestionCustomizeValue")); 
		Response response = typeOfRequest.request(Method.GET,useData.readExcelFile("Drug_Registry_API_Data", 2, 1)); 
		
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body is"+responseBody);
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		softAssert.assertEquals(statusCode, 200,"Invalid status code");
		
		String statusLine = response.getStatusLine();
		System.out.println("Status line is: " + statusLine);
		softAssert.assertEquals(statusLine, "HTTP/1.1 200 ","Invalid status line");
		
		softAssert.assertAll();
		
		}

}
