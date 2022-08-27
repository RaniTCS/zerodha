package Method;

public class Non_stat_from_sameclass
{
	public static void main(String[] args)
	{
		Non_stat_from_sameclass n=new Non_stat_from_sameclass();//object creation
		n.m1();  //calling method with reference variable----"n"
		n.m2();
		n.m3();
		n.m4();	
	}
	public void m1()   //non-static method( because static keyword is not use
	{
		System.out.println("running from m1 from same class");
	}
	public void m2()    //non-static method( because static keyword is not use
	{
		System.out.println("running from m2 from same class");
	}
	public void m3()    //non-static method( because static keyword is not use
	{
		System.out.println("running from m3 from same class");
	}
	public void m4()     //non-static method( because static keyword is not use
	{
		System.out.println("running from m4 from same class");
	}
	

}
