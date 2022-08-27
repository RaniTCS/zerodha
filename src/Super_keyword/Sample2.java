package Super_keyword;

public class Sample2 extends Sample1  //
{ 
	int a=60;//lobal variable of Sub-class
     public void test()//non static method
     {
    	 int a=20;//local variable
    	 System.out.println(a);//first priority goes to local variable as 20
    	 System.out.println(this.a);
    	 System.out.println(super.a);
     }
     
}
