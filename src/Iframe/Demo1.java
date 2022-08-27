package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
    public static void main(String[] args) 
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		//switch to frame no.2
		driver.switchTo().frame("iframeResult");
		//enter First name
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Rajashri");
		//enter last name
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Awari");
		//click submitbutton
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
