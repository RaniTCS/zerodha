package PRACTICE;

public class Switch_statement1 
{
    public static void main(String[] args) 
    {
		switch("rajashri")// finds the same value of expression
		{
		case "Toni":
		{
			System.out.println("execute first");
			break;
		}
		case "payal":
		{
			System.out.println("execute second");
		}
		case "rajashri"://this case value is same as switch------->rajashri
		{
			System.out.println("execute third");
			break;
		}
		case "Rajashri":
		{
			System.out.println("execute fourth");
			break;
		}
		default:
		{
			System.out.println("not execute");
			break;
		}
				
		
		}
	}
}
