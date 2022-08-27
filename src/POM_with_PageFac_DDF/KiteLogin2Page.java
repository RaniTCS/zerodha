package POM_with_PageFac_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page //BLC
{
	//1st stage declaration
   @FindBy(xpath="//input[@id='pin']")private WebElement PIN;
   @FindBy(xpath="//button[@class='button-orange wide']")private WebElement CtnBTN;
   
   //2nd stage Initialization
   public KiteLogin2Page (WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   //3rd step utilization
   public void enterPIN(String pinvalue)
   {
	   PIN.sendKeys(pinvalue);
   }
   public void clickCtnBTN()
   {
	   CtnBTN.click();
   }
   
}
