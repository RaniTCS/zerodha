package ScreenShot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Element_Handling 
{
    public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> allelement = driver.findElements(By.xpath("//div"));
		for(WebElement oneelement:allelement)
		{
			String all = oneelement.getText();
			System.out.println(all);
		}
	}
}
