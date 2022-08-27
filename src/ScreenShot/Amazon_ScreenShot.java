package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon_ScreenShot 
{
   public static void main(String[] args) throws Throwable
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   //maximize
	   driver.manage().window().maximize();
	   //typecast takescreenshot interface
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   //use getscreenshotAs()
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   //we have to store scrrenshot at particular destination creat object of file class
	   File dest=new File("C:\\Users\\Rajashri Awari\\Desktop\\Scrrenshot\\AMAZON.jpg");
	   //you have transfer file to source to destination
	   Files.copy(src, dest);
	             
	
}
}
