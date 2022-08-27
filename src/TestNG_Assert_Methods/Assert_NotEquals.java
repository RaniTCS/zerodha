package TestNG_Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_NotEquals
{
    @Test
    public void TC2()
    {
    	Reporter.log("Running TC2",true);
    	String expR="Rajashri";
    	String actR="Dhanashri";
    	Assert.assertNotEquals("Rajashri", "Dhanashri");
    }
}
