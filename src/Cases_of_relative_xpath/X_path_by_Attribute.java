package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_by_Attribute 
{
    public static void main(String[] args) throws Throwable
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		// username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(3000);
		//password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		//login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		
	}
}
