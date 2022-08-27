package PRACTICE;

public class Non_stat_sm_cls
{
   public static void main(String[] args) //main method
   {
	   Non_stat_sm_cls n=new Non_stat_sm_cls();//create object becoz non static method
	  n.m1();  //reference variable 'n' here and method name is 'm1' called from same class
	  n.m2();
	  n.m3();
	 }
   public void m1() //not static method(because static keyword is not used in this)
   {
	   System.out.println("Non stat for same class");
   }
   public void m2() //not static method(because static keyword is not used in this)
   {
	   System.out.println("Non stat for same class");
   }
   public void m3()  //not static method(because static keyword is not used in this)
   {
	   System.out.println("Non stat for same class");
   }
   
}
