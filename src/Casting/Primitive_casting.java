package Casting;

public class Primitive_casting//ULC
{
   public static void main(String[] args)
   {
	  // double d=55.5;//memory size of byte is 8-byte
	   //int i=30;      //memory size of int is 4-byte
	   double d=40;   //it will print 40.0
	   System.out.println(d);
	  // System.out.println(i);
	   }
}
//above program shows the casting example its declares that the memory size of byte is 8-byte
//so byte default value is 0.0 therefore we declare the double value d=40 id printed as 40.0
//but actual declaration of double is in decimal value such as--(double d=50.5  means decimal value)
//but in casting we declared like this above program internally done by the compiler from jdk 1.5
//1.5 onwords