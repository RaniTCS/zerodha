package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Row
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("C:\\Users\\Rajashri Awari\\Desktop\\VCITY\\SELENIUM 2\\WebTable by ANKUSH (1).html");
	    //print single row
	    String row1=driver.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
	     System.out.println(row1);
	
	    //row2
	   String row2=driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
	    System.out.println(row2);  
}
}

