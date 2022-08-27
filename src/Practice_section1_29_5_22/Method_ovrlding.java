package Practice_section1_29_5_22;

public class Method_ovrlding //Buisness logic class
{
    public void concat(String s1,String s2)//non static regular method with parameter
    {
    	System.out.println("CONCATINATE:" +(s1+s2));
    }
    public void concat(String s1, String s2, String s3)//non static regular method with parameter
    {
    	System.out.println("Concate:" +(s1+s2+s3));
    }
}
//the method having same method name but used different parameter is called method overloading

