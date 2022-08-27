package Method_Practice;

public class G              // my practice program
{
	public static void main(String[] args) 
	{
		m3();
		G g=new G();
		g.m1();
		g.m7();
		G.m2();
	}
	   public void m1()//this is non sta method because static keyword is not use in this
	   {
		   System.out.println("non stat same class");
	}
	public static void  m2()
	{
		System.out.println("stat diff.class");
	}
	public static void m3()
	{
		System.out.println("sta same. class");
	}
	public void m7()
	{
		System.out.println("diff.class non stat");
	}

}
