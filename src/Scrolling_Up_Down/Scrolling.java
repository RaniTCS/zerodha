package Scrolling_Up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling 
{
   public static void main(String[] args) throws Throwable
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   //typecast javascript executer
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy(0,2000);");//inspect amazon window and go console clear it and take
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0,-1000);");
	   
	
}
}
