package PRACTICE;

public class Gun   //this is Business logic class(because no main method is used in this)
{
   String name;
   int noOfBullets;
   public void shoot()    // this is non  static regular method which is created by user/programmer
   {
	   for(int i=1;i<=noOfBullets; i++)
		   System.out.println("deshkaw");
   }
}
// in non static regular method we have to create diff class name object and its reference variable name with method name
// thats why we have to create another class with main method -----and the class name is Pubg
