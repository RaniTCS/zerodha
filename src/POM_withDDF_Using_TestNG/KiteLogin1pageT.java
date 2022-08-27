package POM_withDDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1pageT 
{
    //Step 1 Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	
	//Step2 Initialization
	public KiteLogin1pageT (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Step 3 Utilization
	public void enterUN(String username)
	{
		UN.sendKeys(username);
	}
	public void enterPWD(String password)
	{
		PWD.sendKeys(password);
	}
	public void clickLOGINBTN()
	{
		LOGINBTN.click();
	}
	
}
