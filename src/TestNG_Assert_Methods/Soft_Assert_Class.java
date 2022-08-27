package TestNG_Assert_Methods;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Class 
{
   @Test
   public void TC1()
   {
	   Reporter.log("Running TC1",true);
	   String expR="Hi";
	   String actR="Bye";
	   //create object of soft assert
	   SoftAssert s=new SoftAssert();
	   s.assertEquals(expR,actR);//verification
	   System.out.println("I am after failed verification");//mandatory
	   s.assertAll();
   }
   @Test
   public void TC2()
   {
	   Reporter.log("Hii Helow");
   }
}
