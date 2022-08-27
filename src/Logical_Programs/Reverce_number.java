package Logical_Programs;

public class Reverce_number 
{
    public static void main(String[] args) 
    {
		int num=1234;
		int revnum=0;
		for(int i=1234;i>0;i=i/10)
		{
			int rem=i%10;
			revnum=revnum*10+rem;
		}
		System.out.println(revnum);

	}
}
