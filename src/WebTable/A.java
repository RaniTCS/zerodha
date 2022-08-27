package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajashri Awari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("C:\\Users\\Rajashri Awari\\Desktop\\VCITY\\SELENIUM 2\\WebTable by ANKUSH (1).html");
	    //print student name
	    String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	    System.out.println(sn);
	    //print sachin
	    String schn = driver.findElement(By.xpath("(//table[@id='2244']//td)[2]")).getText();
	    System.out.println(schn);
	    
	    //print sangli
	    String str=driver.findElement(By.xpath("//table[@id='2244']/descendant::td[9]")).getText();
	    System.out.println(str);
	    
	    //print shilpa
	    String shetty = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
	    System.out.println(shetty);
	}
	
}

