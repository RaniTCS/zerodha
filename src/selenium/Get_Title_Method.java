package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   //gettitle()
	   String expT="Google";
	   String actT =driver.getTitle();
	   if(actT.equals(expT))
	   {
		   System.out.println("Test case is pass,expT and actT are matching");
	   }
	   else
	   {
		   System.out.println("Test case is fail,expT and actT are matching");
	   }
   
	  
	
}
}
