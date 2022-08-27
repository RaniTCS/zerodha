package Selenium2_Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_Dropdown
{
    public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rajashri%20Awari/Documents/paradise.html");//HTML PATH(document)
		//inspect dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='PARADISE']"));
		//create object of select class
		Select s=new Select(dropdown);
		//check Wethter Dropdown is multitaskable or not
		if(s.isMultiple())
		{
			System.out.println("The given DD is multitaskable");
		}
		else
		{
			System.out.println("The given DD is Not Multitaskable");
		}
		//get size of all option
		List<WebElement> allelements = s.getOptions();
		System.out.println(allelements);
		//get the text of all elements
		for(int i=0;i<=allelements.size()-1;i++)
		{
			WebElement oneelement = allelements.get(i);
			String text = oneelement.getText();
			System.out.println(text);
		}
	}
    
    
}
