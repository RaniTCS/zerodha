package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  //open the application
	  driver.get("https://www.google.com/");
	  //css selector
	  driver.findElement(By.cssSelector("input[aria-haspopup='false']")).sendKeys("Ankushkumar");
	  
	
}
}
