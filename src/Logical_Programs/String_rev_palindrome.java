package Logical_Programs;

public class String_rev_palindrome 
{
   public static void main(String[] args)
   {
	   String org="MOM";
	   String rev="";
	   for(int i=org.length()-1;i>=0;i--)
	   {
		   rev=rev+org.charAt(i);
	   }
	   System.out.println(rev);
	   if(org.equals(rev))
	   {
		   System.out.println("Given string is palindrome");
	   }
	   else
	   {
		   System.out.println("String is not palindrome");
	   }
	
}
}
