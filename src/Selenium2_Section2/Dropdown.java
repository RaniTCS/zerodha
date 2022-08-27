package Selenium2_Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Rajashri%20Awari/Documents/Goodluck.html");
        //inspect dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='GoodLuck']"));
        //create object of select class
        Select s=new Select(dropdown);
        //use method of select class
        s.selectByIndex(7);//select by index method
        //select by value
        s.selectByValue("b");
        //select by visible text
        s.selectByVisibleText("Biryani");
}
}
