package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
   public static void main(String[] args) throws Throwable 
   {
	   //create object of FIS class
	   FileInputStream fis=new  FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\Zerodha.xlsx");
	   
	   Sheet sh = WorkbookFactory.create(fis).getSheet("Zerodha");
	   //set Property
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   //open application
	   driver.get("https://kite.zerodha.com");
	   //apply wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   //maximize the browser
	   driver.manage().window().maximize();
	   //Enter username
	   String UserName = sh.getRow(0).getCell(0).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UserName);
	   //Enter Password
	   String Password = sh.getRow(0).getCell(1).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	   //click on login button
	   driver.findElement(By.xpath("//button[text()='Login ']")).click();
	   //enter PIN
	   String PIN = sh.getRow(0).getCell(3).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
	   //click on countinue Button
	   driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	   //Verify UserID
	   String expID = sh.getRow(1).getCell(1).getStringCellValue();
	   //inspect USERID
	   String actID = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
	   if(expID.equals(actID))
	   {
		   System.out.println("TC is Pass");
	   }
	   else
	   {
		   System.out.println("TC is Fail");
	   }
	   
	
}
}
