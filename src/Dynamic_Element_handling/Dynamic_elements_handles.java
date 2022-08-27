package Dynamic_Element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_elements_handles 
{
  public static void main(String[] args) throws Throwable
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  //click on cancel button or cross button
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  //click on search enter mobile /search for mobile
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys ("Mobile under 20000" ,Keys.ENTER);
	  Thread.sleep(3000);
	  //navigate the dynamic element(make sure that u r taking class
	  String review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
	  System.out.println(review);
	  Thread.sleep(3000);
	  //using descendant (optional)
	  String rating = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
	  System.out.println(rating);
	
}
}
