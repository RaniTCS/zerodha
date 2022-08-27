package Method;

public class static_call_from_sameclass 
{                                         //class body open
	public static void main(String[] args)
	{                                             // main method body open
		m1();
		m2();   //you can change the sequence like m3,m4,m1,m2
		m3();
		m4();
		
	}                                              //main method body close
	public static void m1()      //regular static method(because keywoed use static)
	{
		System.out.println("running form m1");
	}
	public static void m2()       //regular static method(because keywoed use static)
	{
		System.out.println("running form m2");
	}
	public static void m3()       //regular static method(because keywoed use static)
	{
		System.out.println("running form m3");
	}
	public static void m4()       //regular static method(because keywoed use static)
	{
		System.out.println("running form m4");
	}

}                                                //main class body close
