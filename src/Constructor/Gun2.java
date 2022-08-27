package Constructor;

public class Gun2          //in this program we not use in main method thats why its called as Business Logic Class
  
   {
	   String name;
	   int age;
	   public void m1()     // this is non static method,becoz static keyword is not used in this method
	   {
	   for(int i=1;i<=age;i++)
	   {
		   System.out.println("print age");
	   }
   }
}
// in non static regular method we have to create object of different class with variable name and method name