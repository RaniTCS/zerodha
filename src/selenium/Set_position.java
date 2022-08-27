package selenium;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position
{
   public static void main(String[] args) throws Throwable 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   //set the position
	   Point p=new Point(300,400);
	   driver.manage().window().setPosition(p);
	   Thread.sleep(4000);
	   driver.close();
}
}
