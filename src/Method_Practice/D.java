package Method_Practice;

public class D
{
    public static void main(String[] args)         //main method
    {
		D d=new D();                       //object created same class(class name is"D")
		d.m1();                     //calling regular non_stat method with ref_var name("d")method name m1
		d.m4();                     //calling regular non_stat method with ref_var name
		d.m3();                     //calling regular non_stat method with ref_var name
		d.m2();                     //calling regular non_stat method with ref_var name
	}
    public void m1()                                //non static regular method
    {
    	System.out.println(" Regular non static method from same class m1");
    }
    public void m2()                                 //regular method
    {
    	System.out.println(" Regular non static method from same class m2");
    }
    public void m3()                                  //regular method
    {
    	System.out.println(" Regular non static method from same class m3");
    }
    public void m4()                                  //regular method
    {
    	System.out.println(" Regular non static method from same class m4");
    }
}
