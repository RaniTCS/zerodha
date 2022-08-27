package Method_overriding;

public class Overriding //ULC
{
   public static void main(String[] args) 
   {
	   Principle p=new Principle();//create the object of principle class
	   p.rules();//reference variable name with method name
	   
	   Teacher1 t=new Teacher1();
	   t.computer();
	   
	   Teaacher2 t1=new Teaacher2();
	   t1.electrical();
	   
	   
	   Teacher3 t2=new  Teacher3();
	   t2.mechanical();
	 }
}
//this is the program for method overriding