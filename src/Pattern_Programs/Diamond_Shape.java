package Pattern_Programs;

public class Diamond_Shape 
{
  public static void main(String[] args)
  {
	  int space=2;
	  int star=1;
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=space;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1;j<=star;j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  if(i<=2)
		  {
			  space --;
			  star=star+2;
		  }
		  else
		  {
			  space ++;
			  star=star-2;
		  }
	  }
	
}
}
