package POM_withDDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2pageT
{
   //Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement  cntBtn;
	
	//Initialization
	public KiteLogin2pageT(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void enterPIN(String pinvalue)
	{
		PIN.sendKeys(pinvalue);
	}
	public void clickcntBtn()
	{
		cntBtn.click();
	}
}
