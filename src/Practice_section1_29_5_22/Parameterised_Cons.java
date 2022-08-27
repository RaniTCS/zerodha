package Practice_section1_29_5_22;

public class Parameterised_Cons
{
    String name;
    int rollNo;
    public Parameterised_Cons(String name, int rollNo)
    {
    	this.name=name;
    	this.rollNo=rollNo;
    }
    public void run()
    {
    	for(int i=1;i<=rollNo;i++)
    	{
    		System.out.println("Welcome");
    	}
    }
    
}
