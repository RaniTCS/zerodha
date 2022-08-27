package Actions_class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class 
{
    public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//inspect for target element
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//create object of Actions class
		Actions act=new Actions(driver);
		
		//1st method-----> moveToElement()
		act.moveToElement(gmail).perform();
		
		//2nd method----->rightClick()/contextClick()
		act.moveToElement(gmail).contextClick().perform();
		
		//3rd method----->leftClick()/click()
		act.moveToElement(gmail).click().perform();
		
		//4th method------>doubleClick()
		act.moveToElement(gmail).doubleClick().perform();
		
		//how to perform 3 actions combine insingle statement
		act.moveToElement(gmail).contextClick().doubleClick().build().perform();
		
	}
}
