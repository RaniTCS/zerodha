package TestiNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
  @Test(priority=4)
  public void TC1()
  {
	  Reporter.log("Good bye",true);
  }
  @Test(priority=3)
  public void TC2()
  {
	  Reporter.log("I am Fine",true);
  }
  @Test(priority=2)
  public void TC3()
  {
	  Reporter.log("How are you",true);
  }
  @Test(priority=1)
  public void TC4()
  {
	 Reporter.log("Hellow",true); 
  }
}
