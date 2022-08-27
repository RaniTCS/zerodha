package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_url_Method 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  //get the current url
	  String link = driver.getCurrentUrl();//link is variable
	  System.out.println(link);
	  driver.close();
	
}
}
