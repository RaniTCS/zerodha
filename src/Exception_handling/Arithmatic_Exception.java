package Exception_handling;

public class Arithmatic_Exception 
{
   public static void main(String[] args)
   {
	   int a=1;
	   int b=0;
	   try
	   {
		  int c=a/b; //RISKY CODE
	   }
	   catch(ArithmeticException ref)
	   {
		   System.out.println("idiot! enter valid dinominator");
	   }
	   System.out.println(" BOSS Exception is handling");
	
}
}//using try and catch block
