package This1_keyword;

public class Demo1 extends Demo//BLC
{
  int a=30; //Global variable
public void test()
{
	int a=40;// Local Variable
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	
}
}
