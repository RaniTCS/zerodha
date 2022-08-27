package Method_overloading;

public class Method_ovrlding//Business Logic Class
{
    public void addition(int a, int b)//non static regular method
    {
    	System.out.println("ADDITION:" +(a+b));
    }

    public void addition(int a, int b, int c)
    {
    	System.out.println("ADDITION:" +(a+b+c));
    }
  }
