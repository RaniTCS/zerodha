package Hierchachicle;

public class Combine //User logic class because of main method used in this program
{
   public static void main(String[] args)//main method
   {
	   Computer c=new Computer();//create object of computer class
	   c.book();// call reference variable with method name 
	   c.ground();
	   c.practical();
	   c.student();
	  System.out.println("COMPUTER DEPARTMENT");
	  
	  Mechanical m=new Mechanical();
	  m.book();
	  m.exam();                       //THIS IS THE EXAMPLE OF HIERACHICLE INHERITANCE
	  m.ground();                   
	  m.student();
	  System.out.println("MECHANICAL DEPARTMENT");
	  
	  Civil l=new Civil();
	  l.book();
	  l.ground();
	  l.student();
	  l.viva();
	  System.out.println("CIVIL DEPARTMENT");
	  
	
}
}
