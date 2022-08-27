package Variables;

public class Variable_rules
{ 
	public static void main(String[] args) 
	{   
		int i=88; //Rule no.1[printing variable means print value of variable]
		System.out.println(i);
		float h=1f;  //Rule 2 (without initialization and Declaration can't use local variable)
		//System.out.println(h);
		float j=20f;  //Rule 3 (Two local variable does not have same name as j)
		//byte j=45;    // Rule 3 ------same
		System.out.println(j);
		short o=34;  //Rule 4  (Reinitialize any no. of times)
	    o=67;
		o=90;
		o=43;
		o=58;
		System.out.println(o);//Rule 5( latest value print as 58)
		//output is reinitialize  is done then latest/ new value can be printed and previous value are deleted.
		//are deleted previous value. or vanished.
		//then output will be as "58"
		}
	}

//above program gives error for some lines gives error because this is rules for understanding