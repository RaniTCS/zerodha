package PRACTICE;

import java.util.Scanner;

public class I
{
   public static void main(String[] args)
   {
	 int age;
	 System.out.println("enter your age");
	 Scanner s=new Scanner(System.in);
	 age=s.nextInt();
	 if(age>=18)
	 {
		 System.out.println("eligible for vote");
	 }
	 System.out.println("thank you!");
	 
   }
}
