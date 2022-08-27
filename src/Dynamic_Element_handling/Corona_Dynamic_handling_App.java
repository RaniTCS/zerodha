package Dynamic_Element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Dynamic_handling_App
{
   public static void main(String[] args) throws Throwable
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.worldometers.info/coronavirus/country/uk");
	   Thread.sleep(3000);
	   //corona virus cases
	  String text1 = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
	  System.out.println(text1);
	  Thread.sleep(3000);
	  //corona virus death
	  String text2 = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();
	  System.out.println(text2);
	  Thread.sleep(3000);
	  //for discover
	  String text3 = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
	  System.out.println(text3);
	
}
}
