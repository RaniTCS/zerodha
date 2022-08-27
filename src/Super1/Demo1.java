package Super1;

public class Demo1 extends Demo
{
   char ch='P';       //GLOBAL VARIABLE
   float d=1.5f;     //GOBAL VARIABLE
   public void test()//NON-STATIC METHOD
   {
	   char ch='T';//LOCAL VARIABLE USED INSIDE THE METHOD
	   float d=9.0f;//LOCAL VARIABLE USED INSIDE THE METHOD
	   System.out.println(ch);
	   System.out.println(this.ch);//using this keyword
	   System.out.println(super.ch);//using super keyword
	   System.out.println(d);
	   System.out.println(this.d);
	   System.out.println(super.d);
 }
}
