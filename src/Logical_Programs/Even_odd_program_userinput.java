package Logical_Programs;

import java.util.Scanner;

public class Even_odd_program_userinput
{
   public static void main(String[] args)
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the Number");
	       int num = scan.nextInt();
	       if(num%2==0)
	       {
	    	   System.out.println("The enter number is even");
	       }
	       else
	       {
	    	   System.out.println("The enter number is odd");
	       }
}
}
