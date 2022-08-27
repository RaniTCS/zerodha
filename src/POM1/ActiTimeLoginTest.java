package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginTest
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   //1st page
	   ActiTimePage1 login1=new ActiTimePage1(driver);
	   login1.enterUN();
	   login1.enterPWD();
	   login1.clickLGNBTN();
	   
	   //2nd page
	   ActiTimeHomePage login2=new ActiTimeHomePage(driver);
	   login2.verifyuserHP();
	   driver.close();
	   
	   
	
}
}
