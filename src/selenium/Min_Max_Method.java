package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Min_Max_Method
{
   public static void main(String[] args) throws Throwable 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   Thread.sleep(3000);
	   //maximize the window
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   //manimize the window
	   driver.manage().window().minimize();
	   Thread.sleep(4000);
	   driver.close();
	
}
}
