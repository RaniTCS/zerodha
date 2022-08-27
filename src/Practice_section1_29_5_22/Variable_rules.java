package Practice_section1_29_5_22;

public class Variable_rules
{
   public static void main(String[] args)
   {
	   int i=20;//rule 1 + rule 2
	   //byte i=30;  duplicate variable name not allow('i' is duplicate)
	short s=22; //rule 4(re-initialization)
	s=34;
	s=35;
	s=29;
	s=12;
	s=90;
	System.out.println(s);// rule 5----done re-initialization latest value will be print
	
	//all previous value get vanished
	 
			   
	   
	
}
}
