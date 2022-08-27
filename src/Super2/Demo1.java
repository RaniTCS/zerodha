package Super2;

public class Demo1 extends Demo
{
   int a=40;//global variable used inside the class
   public void test()
   {
	   int a=60;// local variable used inside the method body
	   System.out.println(a);
	   System.out.println(this.a);
	   System.out.println(super.a);
   }
}
