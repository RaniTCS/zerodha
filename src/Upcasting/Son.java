package Upcasting;

public class Son extends Father//BLC
{
    public void money()
    {
    	System.out.println("money:150");
    }
    public void mobile()// This method externally created by developer/test engineer
    {
    	System.out.println("my mobile"); 
    }
}
