package Multiple_Element_handl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multiple_element 
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   //click on X button
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	  //find multiple element
	  List<WebElement> ele = driver.findElements(By.xpath("//div"));
	  //apply for each loop
	  for(WebElement e:ele)
	  {
		  String txt = e.getText();
		  System.out.println(txt);
	  }
	
}
}
