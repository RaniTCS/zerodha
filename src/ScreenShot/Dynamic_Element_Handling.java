package ScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Element_Handling
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	   String text = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
	   System.out.println(text);
	
}
}
