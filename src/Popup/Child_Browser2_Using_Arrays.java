package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser2_Using_Arrays 
{
   public static void main(String[] args) throws Throwable 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   //click on X button(popup)
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	   //click on search field
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
	   //click on search button
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   //click on first mobile (click blue word which open another window)new child window open
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
	   //bydefault selenium control is on winndow,we have to switch main window to child window
	   Thread.sleep(3000);
	  Set<String> allwindos = driver.getWindowHandles();
	  //use arraylist to store all windows
	 ArrayList<String> al=new ArrayList<String>(allwindos);
	 String cw=al.get(1);
	 System.out.println(cw);
	 //print main window session id
	 String mainwindow=al.get(0);
	 System.out.println(mainwindow);
	 //switch to main window
	 Thread.sleep(3000);
	 driver.switchTo().window(al.get(0));//zero main window
	 //for confirmation get title
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	   
	
}
}
