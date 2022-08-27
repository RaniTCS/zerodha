package Customize_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A 
{
  public static void main(String[] args) throws Throwable
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  //click on create new account button
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  //select list box of month
	  Thread.sleep(3000);
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 //create object of actions class
	 Actions act=new Actions(driver);
	 //click on month
	 Thread.sleep(3000);
	 act.click(month).perform();
	 //move to upside
	 Thread.sleep(3000);
	 act.sendKeys(Keys.ARROW_UP);
	 act.sendKeys(Keys.ARROW_UP);
	 act.sendKeys(Keys.ARROW_UP);
	 //move down
	 Thread.sleep(3000);
	 act.sendKeys(Keys.ARROW_DOWN).perform();
	 //select topmost element
	 Thread.sleep(3000);
	 act.sendKeys(Keys.HOME).perform();
	 Thread.sleep(3000);
	 //click on element
	 act.sendKeys(Keys.ENTER).perform();
	 
	 
	  
	
}
}
