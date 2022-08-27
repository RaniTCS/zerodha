package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime
{
public static void main(String[] args) throws Throwable
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	   Thread.sleep(4000);
	   driver.findElement(By.id("loginButton")).click();
	   Thread.sleep(4000);
	   String expT="actiTIME - Enter Time-Track";
	   Thread.sleep(2000);
	   String actT=driver.getTitle();
	   Thread.sleep(2000);
	   if(expT.equals(actT))
	   {
		   System.out.println("Home page is open.test case is pass");
	   }
	   else
	   {
		   System.out.println("Home page is not open.test case is fail");
	   }
	  
	   
	   
	   
	   
	
}
}
