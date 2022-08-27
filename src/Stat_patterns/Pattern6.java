package Stat_patterns;

public class Pattern6 
{
   public static void main(String[] args) 
   {
	   for(int i=1;i<=4;i++)//outer
	   {
		   for(int j=1;j<=4;j++)//inner
		   {
			   if(i==1&&j==1)
			   {
				   System.out.print("@");
			   }
			   else if(i==4&&j==4)
			   {
				   System.out.print("#");
			   }
			   else
			   {
				   System.out.print("*");
			   }
		   }
		   System.out.println();
	   }
	
}
}
