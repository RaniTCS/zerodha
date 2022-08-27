package TestiNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TC_using_False_Keyw
{
   @Test
   public void TC1()
   {
	   Reporter.log("running tc2",true);
   }
   @Test
   public void TC2()
   {
	   Reporter.log("running tc2",true);
   }
   @Test(enabled=false)
   public void TC3()
   {
	   Reporter.log("Running tc3",true);
   }
}
