package Logical_Programs;

public class Prime_Number
{
  public static void main(String[] args)
  {
	  int num=11;
	  int count=0;
	  for(int i=1;i<=num;i++)
	  {
		  if(num%i==0)
		  {
			  count++;
		  }
		  
	  }
	  if(count==2)
	  {
		  System.out.println("No is Prime");
	  }
	  else
	  {
		  System.out.println("No is not prime");
	  }
	  
	
}
}
