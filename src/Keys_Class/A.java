package Keys_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
    public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.actitime.com/login.do");
    	/*//username
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
    	//password
    	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    	//login
    	driver.findElement(By.xpath("//div[text()='Login ']")).click();
    	*/
    	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
    }
}
