package Logical_Programs;

public class Armstrong_Number 
{
   public static void main(String[] args) 
   {
	   int n=153;
	   int temp=n;
	   int r,sum=0;
	   
	   while(n>0)
	   {
		   r=n%10;
		   r=n/10;
		   sum=sum+r*r*r;
		}
	   if(temp==sum)
	   {
		   System.out.println("it is armstrong number");
	   }
	   else
	   {
		   System.out.println("It is armstrong number");
	   }
	
}
}
