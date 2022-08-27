package Exception_handling;

public class A 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);//Risky code
		}
		catch(NullPointerException obj)
		{
			System.out.println("Idiot!enter valiad denominator");
		}
		finally                                //using finally
		{
			System.out.println("Thank you for using ATM");
		}
		
	}
	

}
