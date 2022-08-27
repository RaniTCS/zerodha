package TestNG_Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals 
{
   @Test
   public void TC1()
   {
	   Reporter.log("Running TC1",true);
	   String expR="Hi";
	   String actR="Hi";
	   Assert.assertEquals(expR, actR);
   }
}
