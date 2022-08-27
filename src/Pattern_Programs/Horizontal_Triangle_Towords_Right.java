package Pattern_Programs;

public class Horizontal_Triangle_Towords_Right
{
    public static void main(String[] args) 
    {
		int star=1;//first row only one star is present
		for(int i=1;i<=7;i++)//no of rows 7
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=3)//
			{
				star ++;
			}
			else
			{
				star --;
			}
		}
	}
}
