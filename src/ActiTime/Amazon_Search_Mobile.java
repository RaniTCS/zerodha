package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search_Mobile 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	//use css selector(choice the mobile)
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobiles under 20000");
	    //click on search button
	    driver.findElement(By.cssSelector("input[value='Go']")).click();
	
}
}
