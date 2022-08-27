package Logical_Programs;

public class White_spaces_remove_from_character 
{
   public static void main(String[] args)
   {
	   String name="V E L O C I T Y";
	   int count=0;
	   for(int i=0;i<=name.length()-1;i++)
	   {
		  char ch =name.charAt(i);
		  if(ch==' ')
		  {
			  count++;
		  }
	   }
	   System.out.println(count);
	
}
}
