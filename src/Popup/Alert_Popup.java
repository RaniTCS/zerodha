package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup 
{
    public static void main(String[] args) throws Throwable 
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//enter id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch from main webpage to alert popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(4000);
		
		//click on ok button
		alt.accept();
		
		//click on cancel button
		alt.dismiss();
		
		//get the text from popup
		Thread.sleep(3000);
		
		String text = alt.getText();
		System.out.println(text);
		
	}
}
