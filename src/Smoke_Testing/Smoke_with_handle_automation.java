package Smoke_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke_with_handle_automation
{
    public static void main(String[] args) throws Throwable 
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String expT = "actiTIME - Login";
		String actT = driver.getTitle();
		if(expT.equals(actT))
		{
			System.out.println("Title is Matching test case is pass");
		}
		else
		{
			System.out.println("Not matching ,Test case is fail");
		}
		//username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String expT1 = "actiTIME - Enter Time-Track";
		String actT1 = driver.getTitle();
		Thread.sleep(3000);
		if(expT1.equals(actT1))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("Rajashri");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();
		
		
	}
}
