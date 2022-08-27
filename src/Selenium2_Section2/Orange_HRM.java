package Selenium2_Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_HRM 
{
   public static void main(String[] args)
   {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  // enter username
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  //enter password
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	  //login Button
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  //click on Admin button
	  driver.findElement(By.xpath("//b[text()='Admin']")).click();
	  //inspect dropdown
	 WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
	 //create object of select class
	 Select s=new Select(dropdown);
	 //use method of select class
	 //s.selectByIndex(1);//select by index method
	 //select by value
	 //s.selectByValue(null);
	 //select by visible text
	 s.selectByVisibleText("ESS"); 
	  
   }
}
