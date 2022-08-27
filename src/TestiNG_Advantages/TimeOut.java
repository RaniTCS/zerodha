package TestiNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut
{
   @Test(timeOut=8000)
   public void TC()
   {
	   Reporter.log("Hii",true);
   }
}
