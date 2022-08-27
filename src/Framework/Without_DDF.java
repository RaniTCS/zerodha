package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   //open the application
	   driver.get("https://kite.zerodha.com/");
	   //maximize the browser
	   driver.manage().window().maximize();
	   //give global wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   //enter the user id
	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	   //enter password
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
	   //click on login button
	   driver.findElement(By.xpath("//button[text()='Login ']")).click();
	   //enter PIN
	   driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	   //click on countinew button
	   driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	   //verify user id
	   String expID="DPG458";
	   //inspect ID
	   String actID = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
	  if(expID.equals(actID))
	  {
		  System.out.println("Both are same TC is pass");
	  }
	  else
	  {
		  System.out.println("Both are not same TC is Fail");
	  }
	   
	
}
}
