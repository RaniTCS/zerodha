package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage1
{
	//1st Declaration
    @FindBy(xpath="//input[@id='username']") private WebElement UN;
    @FindBy(xpath="//input[@name='pwd']") private WebElement PWD;
    @FindBy(xpath="//div[text()='Login ']") private WebElement LGNBTN;
    
    //2nd Initialization
    public ActiTimePage1(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    //step3 implementation
   
    public void enterUN()
    {
    	UN.sendKeys("admin");
    }
    public void enterPWD()
    {
    	PWD.sendKeys("manager");
    }
    public void clickLGNBTN()
    {
    	LGNBTN.click();
    }
    
}
