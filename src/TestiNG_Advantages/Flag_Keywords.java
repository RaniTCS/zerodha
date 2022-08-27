package TestiNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag_Keywords
{
   @Test(invocationCount=10)
   public void TC()
   {
	   Reporter.log("running TC",true);
   }
}
