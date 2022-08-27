package Logical_Programs;

public class Number_palindrome_rev
{
   public static void main(String[] args)
   {
	   int num=121;
	   int revNum=0;
	   for(int i=121;i>0;i=i/10)
	   {
		   int rem=i%10;
		   revNum=revNum*10+rem;
	   }
	   System.out.println(revNum);
	   if(num==revNum)//we compare number then == is used in numbers
	   {
		   System.out.println("the given number is palindrome");
	   }
	   else
	   {
		   System.out.println("Not Palindrome");
	   }
	
}
}
