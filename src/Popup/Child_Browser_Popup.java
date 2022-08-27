package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup
{
   public static void main(String[] args) throws Throwable
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   //click on cancel button
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	   //Search for mobile
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
	   //click on search button
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   Thread.sleep(3000);
	   //click on first mobile so that new child will open
	   driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	   //bydefault selenium control should be on main window we have switch it from main window to child
	   Set<String> allwindow = driver.getWindowHandles();
	   //apply for each loop
	   for(String singlewindow:allwindow)
	   {
		   driver.switchTo().window(singlewindow);//now your selenium control goes from main window to child
	   }
	   //get the text of child window for our conformation
	   Thread.sleep(3000);
	   String expT="realme C11 2021 (Cool Blue, 32 GB)  (2 GB RAM)";
	   String actT=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();//inspect mobile Text(blue colour)
	  System.out.println(actT);
	//verify the child window handle or not
	    Thread.sleep(3000);
	    if(expT.equals(actT))
	    {
	    	System.out.println("child window is handles and TC is pass");
	    }
	    else
	    {
	    	System.out.println("else TC is fail");
	    }
	    
	
}
}
