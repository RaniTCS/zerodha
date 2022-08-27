package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest
{
    public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//maximize
		driver.manage().window().maximize();
		//implicitely wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//1st POM class
		KiteLogin1Page login1=new KiteLogin1Page (driver);
		login1.enterUN();
		login1.enterPWD();
		login1.LOGBTN();
		
		//2nd POM class
		KitLogin2Page login2=new KitLogin2Page(driver);
		login2.enterPIN();
		login2.clickCTNBTN();
		
		//3rd POM class
		
		KiteHomePage hm=new KiteHomePage(driver);
		hm.verifyuserID();
		
		
	}
}
