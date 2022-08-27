package Upcasting;

public class Combine_upcasting //ULC
{
  public static void main(String[] args)
  {
	Father s=new Son();// created object of "Son" class with reference variable "Father".
	s.money();
	
   }
}
//the above program shows the created object of sub class "Son class"then reference variable
// taken as super class is the "Father class".
//so only money method printed here not mobile, because it is externally added. 
// mobile method is not in super class as Father class.