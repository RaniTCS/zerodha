package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage
{
   //declaration
	@FindBy(xpath="(//td[@class='pagetitle'])[1]")private WebElement userHP;
	
	//Initialization
	public ActiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void verifyuserHP()
	{
	 String expID="Enter Time-Track";
	 String actID=userHP.getText();
	 if(actID.equals(expID))
	 {
		 System.out.println("TC is pass");
	 }
	 else
	 {
		 System.out.println("TC is fail");
	 }
	
		 
	 
	}	
}
