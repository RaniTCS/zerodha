package Method_Practice;

public class A 
{                                    //class body open
	public static void main(String[] args)                  //main method
	{                                //main method body open
		m1();               //calling method
		m2();               //directly call the method  as----(method name();)
		m3();
		m4();
	}                                 ////main method body close     
	public static void m1()   //(because static keyword is used   // Static regular method
	{
		System.out.println("static call from same class m1");
	}
	public static void m2()                                   //  Static regular method
	{
		System.out.println("static call from same class m2");
	}
	public static void m3()                                     // Static regular method
	{
		System.out.println("static call from same class m3");
	}
	public static void m4()                                       //  Static regular method
	{
		System.out.println("static call from same class m4");
	}
}                                   //class body close
