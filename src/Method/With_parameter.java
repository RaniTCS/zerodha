package Method;

public class With_parameter   // main class
{
   public static void main(String[] args)     //main method
   {
	  addition(50,30);  //CTB---->COMPILE TIME BINDING
   }
   public static void addition(int a,int b)    //static regular method with parameter
   {
	   int c=a+b;
	   System.out.println(c);
   }
}
