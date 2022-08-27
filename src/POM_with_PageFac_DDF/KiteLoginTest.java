package POM_with_PageFac_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest  //ULC
{
    public static void main(String[] args) throws Throwable
    {
		FileInputStream fis=new FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Zerodha");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/?next=%2Fholdings");
		//maximize
		driver.manage().window().maximize();
		//implicitely wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//call 1st POM class
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterUN(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		
		login1.clickLOGINBTN();
		
		//call 2nd Page POM class
		KiteLogin2Page login2=new KiteLogin2Page (driver);
		String pinvalue = sh.getRow(0).getCell(3).getStringCellValue();
		login2.enterPIN(pinvalue);
		
		login2.clickCtnBTN();
		
		//call 3rd Page POM class
		KiteHomePage home=new KiteHomePage(driver);
		String expuserID = sh.getRow(0).getCell(0).getStringCellValue();
		home.verifyUserID(expuserID);
		driver.close();
    }
	
}
