package Inheritance;

public class Single_level_inheritance //User Logic Class
{
   public static void main(String[] args) //main method
   {
	   Son s=new Son();// create object of class son
	   s.home(); //call all methods with refernce variable "s"
	   s.car();
	   s.money();
	   s.secondHandBike();
	   System.out.println("Beautiful Wife");
	   //call object class method
	  // s.hashCode();//Automatic(just you write that s.)
	  // s.toString();//Automatic(just you write that s.)
	  // s.notify();//Automatic(just you write that s.)
	
}
}
