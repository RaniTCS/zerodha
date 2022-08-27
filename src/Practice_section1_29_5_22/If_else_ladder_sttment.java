package Practice_section1_29_5_22;

public class If_else_ladder_sttment
{
     public static void main(String[] args) 
     {
		int gage=21;
		int bage=23;
		if(gage>=18&& bage>=21)
		{
			System.out.println("eligible for marriage");
		}
		else if(gage<=18&&bage<=21)
		{
			System.out.println("not eligible for marriage");
		}
		else if(gage==bage)
		{
			System.out.println("not define");
		}
		else
		{
			System.out.println("getout from here");
		}
			
	}
}
