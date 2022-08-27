package Method_overloading;

public class Method_overlding //User logic class because of main method
{
   public static void main(String[] args)//main method
   {
	   Method_ovrlding mo=new Method_ovrlding();//create object of Diff. class(Non static method)
	   mo.addition(10, 20);//call method with reference variable name "mo".
	   mo.addition(10, 20, 30);
	   System.out.println("COMPLETE ADDITION");
	
   }
}
