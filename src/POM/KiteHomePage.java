package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//Declaration
    @FindBy(xpath="//span[@class='user-id']")private WebElement userID;
    
    //Initialization
    public KiteHomePage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    //utilization
    
    public void verifyuserID()
    {
    	String expID="DPG458";
    	String actID=userID.getText();
    	if(expID.equals(actID))
    	{
    		System.out.println("TC is Pass");
    	}
    	else
    	{
    		System.out.println("TC is Fail");
    	}
    }
}
