package String_methods;

public class Reverse_String2
{
   public static void main(String[] args) 
   {
	   String org="Rajashri";
	   String rev="    ";
	   for(int i=org.length()-1;i>=0;i--)
	   {
		   rev=rev+org.charAt(i);
	   }
	   System.out.println(rev);
	   if(org.equals(rev))//checking string is palindrome or not
	   {
		   System.out.println("String is palindrome");
	   }
	   else
	   {
		   System.out.println("String is not palindrome");
	   }
	
}
}
