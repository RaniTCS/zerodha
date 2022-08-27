package Selenium2_Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_DD_Autosugessions 
{
   public static void main(String[] args) throws Throwable 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   //enter KGF movie in google search
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("KGF");
	   Thread.sleep(3000);
	   //inspect element
	 List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));//more than 1 of 1 element taking
	 //use for each loop
	 for(WebElement oneoption:alloptions)
	 {
		 String text = oneoption.getText();
		 System.out.println(text);
		 if(text.contains("K.G.F: Chapter 1"))
		 {
			 oneoption.click();
			 break;
		 }
	 }
	 
 }
}
