package Pattern_Programs;

public class Right_Angle_Triangle 
{
  public static void main(String[] args)
  {
	   int  star=1;//no.of star at first column
	   for(int i=1;i<=5;i++)
	   {
		   for(int j=1;j<=star;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		   star ++;
	   }
	
}
}
