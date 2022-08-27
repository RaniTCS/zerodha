package Practice_section1_29_5_22;

public class Non_stat_samecls
{
   public static void main(String[] args)
   {
	   Non_stat_samecls n=new Non_stat_samecls();//creating object of same class(becoz non-stat method)
	   n.m1();//reference variable name is "n" and method name "m1" calling in main method
	   n.m2();//reference variable name is "n" and method name "m1" calling in main method
	   n.m3();//reference variable name is "n" and method name "m1" calling in main method
	   n.m4();//reference variable name is "n" and method name "m1" calling in main method
	
   }
   public void m1()
   {
	   System.out.println("non static call from same class m1");
   }
   public void m2()
   {
	   System.out.println("non static call from same class m2");
   }
   public void m3()
   {
	   System.out.println("non static call from same class m3");
   }
   public void m4()
   {
	   System.out.println("non static call from same class m4");
   }
}
