package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_contains 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
	   //enter username
	   driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	   //enter password
	   driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	   //enter login button
	   driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	   
	
}
}
