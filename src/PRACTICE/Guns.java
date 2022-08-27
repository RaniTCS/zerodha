package PRACTICE;

public class Guns 
{
   String name;
   int noOfBullets;
   public Guns(String name, int noOfBullets)//constructor
   {
	   this.name=name;
	   this.noOfBullets=noOfBullets;
   }                                   //close body of constrcutor
   public void shoot()//non static method
   {
	   for(int i=1;i<=noOfBullets;i++)
	   {
		   System.out.println("Deshkaw");
	   }
   }
}
