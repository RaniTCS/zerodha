package TestNG_Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true
{
   @Test
   public void TC3()
   {
	   Reporter.log("Running TC3",true);
	   boolean actR=true;
	   Assert.assertTrue(actR);
   }
}
