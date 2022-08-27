package TestNG_Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail
{
	@Test
	public void TC1()
	{
		Reporter.log("running TC4",true);
		{
			Assert.fail();//verification1
			System.out.println("I am After fail");//verification2
		}
	}
	@Test
	public void TC2()
	{
		Reporter.log("I am from TC2");
	}
		
		
	
}
