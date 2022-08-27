package TestiNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable
{
   @Test(priority=1)
   public void TC1()
   {
	   Reporter.log("Hie",true);
   }
   @Test(enabled=false)
   public void TC2()
   {
	   Reporter.log("How are you",true);
   }
}
