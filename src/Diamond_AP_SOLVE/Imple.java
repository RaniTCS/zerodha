package Diamond_AP_SOLVE;

public class Imple implements I1,I2//in interace implements keyword is used and class name is I1,I2
{
  public void m1()//before void puclic is compalsaory becuase it is in class not interface
  {
	  System.out.println("Running from interface 1");
  }
  public void m2()
  {
	  System.out.println("Running from Interface 1");
  }
  public void m3()
  {
	  System.out.println("Running from interface 2");
  }
  public void m4()
  {
	  System.out.println("Running from interface 2");
  }
}
