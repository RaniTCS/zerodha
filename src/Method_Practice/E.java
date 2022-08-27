package Method_Practice;

public class E 
{
   public static void main(String[] args)
   {
	  
	  
	   F f=new F();    //create object of different class------>class name "F" 
	  f.m1();        //calling method from different class with variable name---->f
	  f.m2();         //calling method from different class with variable name---->f
	  f.m3();        //calling method from different class with variable name---->f
	  f.m4();        //calling method from different class with variable name---->f
	  f.m5();         //calling method from different class with variable name---->f
	  
	  F.m6();         //static method from diff. class(Class name.method name)
	  F.m7();
	  
	  
	}
}