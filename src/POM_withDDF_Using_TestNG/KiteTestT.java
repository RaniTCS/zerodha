package POM_withDDF_Using_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestT 
{
    //Declare all usefull members as global
	Sheet sh;
	WebDriver driver;
	KiteLogin1pageT login1;
	KiteLogin2pageT login2;
	KiteHomepageT home;

	
	@BeforeClass
	public void OpenBrowser() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\Zerodha.xlsx");
	     sh = WorkbookFactory.create(fis).getSheet("Zerodha");
	     
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://kite.zerodha.com/");
	      //maximize
	      driver.manage().window().maximize();
	      //implicitetly wait
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      
	      //all objects of POM class
	      login1=new KiteLogin1pageT(driver);
	      login2=new KiteLogin2pageT (driver);
	      home=new KiteHomepageT(driver);
	}
	@BeforeMethod
	public void loginToApp()
	{	
		//enter UN
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterUN(username);
		
		//enter PWD
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		
		//click on login Button
		login1.clickLOGINBTN();
		
		//enter PIN
		 String pinvalue = sh.getRow(0).getCell(3).getStringCellValue();
		 login2.enterPIN(pinvalue);
		 
		 //click on countinue Button
		 login2.clickcntBtn();
	}
	@Test
	public void verifyuserID()
	{
		Reporter.log("running verified user ID",true);
		String actID = home.verifyuserID();
		String expID = sh.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(actID, expID,"Both are different TC is fail");
	}
	@AfterMethod
		public void logoutApp()
		{
			Reporter.log("logout the Application",true);
		}
	@AfterClass
		public void closeBrowser()
		{
			Reporter.log("close the App",true);
		}
	}
	

