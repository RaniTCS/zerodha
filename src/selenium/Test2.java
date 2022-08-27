package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		//to maximize google window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//to minimize the window
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.close();
	}
}

		
		
		
		
	


