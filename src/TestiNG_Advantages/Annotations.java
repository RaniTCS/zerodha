package TestiNG_Advantages;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations 
{
   @BeforeClass
	   public void openbrowser()
	   {
		 Reporter.log("open browser",true);  
	   }
   @BeforeMethod
   public void Loginapplication()
   {
	   Reporter.log("Login Application",true);
   }
   @Test
   public void verifyuserID()
   {
	   Reporter.log("verify user ID",true);
   }
   @AfterMethod
   public void logoutApplication()
   {
	   Reporter.log("Logout Application",true);
   }
   @AfterClass
   
	   public void closebrowser()
	   {
	   Reporter.log("close browser",true);
	   }
   
}
