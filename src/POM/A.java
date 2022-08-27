package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
     public static void main(String[] args) 
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.google.com/");
    	 WebElement txtfield = driver.findElement(By.xpath("//input[@name='q']"));
    	 txtfield.sendKeys("URI");   //@1020
    	 driver.navigate().refresh();
    	 txtfield.sendKeys("Sairat");//@2020
	}
}
