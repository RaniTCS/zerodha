package SIB;

public class Initializer_block 
{
	public static void main(String[] args)
	{
		System.out.println("first ststement");   //main method statement
		System.out.println("second ststement");   //main method statement
		System.out.println("third ststement");     //main method statement
		System.out.println("fourth ststement");      //main method statement
		System.out.println("fifth ststement");      //main method statement
		System.out.println("sixth ststement");       //main method statement
	}
    static//static block executes first
	{
    	System.out.println("Rajashri");  // this statement execute first and then main method execute
    }
    static//static block executes first 
    {
    	System.out.println("Awari");// executed next and so on.
    }

}//SBI-- Staic Initializer Block  (before main method static block will be executed)
