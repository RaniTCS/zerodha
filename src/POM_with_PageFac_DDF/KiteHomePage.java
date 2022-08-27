package POM_with_PageFac_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage //BLC
{
   //Declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement UserID;
	
	//Initialization
	
	public KiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void verifyUserID(String expID)
	{
		String actID = UserID.getText();
		if(expID.equals(actID))
		{
			System.out.println("TC is PASS");
		}
		else
		{
			System.out.println("TC is FAIL");
		}
	}
}
