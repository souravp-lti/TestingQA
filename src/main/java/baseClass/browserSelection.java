package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ExtentReport_Listener.Listener;


public class browserSelection extends Listener{
	
	public  static WebDriver driver;
    Properties prop = new Properties();
	
	
	//SoftAssert soft = new SoftAssert();
    
	
    public String readPropertyFile(String value) throws IOException
    {
        //Properties prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\\\Users\\\\USER\\\\eclipse-workspace\\\\ABDM_Automation_Script.v.20\\"
        		+ "\\src\\\\main\\\\java\\\\Configuration\\\\configDetails.properties");
        prop.load(file);
        return prop.getProperty(value);
        
    }
    
   
    public void initialization() throws IOException
    {
        String browserName = readPropertyFile("browserType");
        if(browserName.equalsIgnoreCase("chrome"))
        {
        System.setProperty("webdriver.chrome.driver", readPropertyFile("webDriverPath"));
        ChromeOptions opt1 = new ChromeOptions(); 
        //opt1.addArguments("--disable-notifications"); // to disable browser exception
        //opt1.addArguments("--headless");
        opt1.addArguments("--incognito");             // to run the test in Incognito mode 
        opt1.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        opt1.addArguments("--no-sandbox"); // Bypass OS security model
        opt1.addArguments("disable-infobars"); // disabling infobars
        opt1.addArguments("--disable-extensions"); // disabling extensions
        opt1.addArguments("--disable-gpu"); // applicable to windows os only
        opt1.addArguments("--ignore-certificate-errors");
        opt1.addArguments("--disable-popup-blocking");
        opt1.addArguments("--disable-default-apps");
        opt1.addArguments("--disable-extensions-file-access-check");
        driver = new ChromeDriver(opt1);
        
        //soft.assertAll();
        }
        
        else if(browserName.equalsIgnoreCase("gecko"))
        {
        	System.out.print("gecko");
        }
        
        else
        {
        	System.out.print("invalid browser");
        }
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();    //To delete all browser cookies
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get(readPropertyFile("url"));
        
    }
}
