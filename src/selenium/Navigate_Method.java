package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method 
{
   public static void main(String[] args) throws Throwable 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   //navigate
	   driver.navigate().to("https://www.google.com/");
	   Thread.sleep(3000);
	   driver.navigate().to("https://www.amazon.com/");
	   Thread.sleep(3000);
	   //backword
	   driver.navigate().back();
	   //forward
	   driver.navigate().forward();
	   //refresh
	   driver.navigate().refresh();
	   //close()
	  // driver.close();//used to close current url
	   driver.quit();//used to close all url
	
}
}
