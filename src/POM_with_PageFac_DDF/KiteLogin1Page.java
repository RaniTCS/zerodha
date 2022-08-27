package POM_with_PageFac_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page //BLC
{
   //1st step Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	
	//2nd step initialization
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3rd step utilization
	public void enterUN( String username)
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
