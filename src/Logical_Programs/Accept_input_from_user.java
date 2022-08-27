package Logical_Programs;

import java.util.Scanner;

public class Accept_input_from_user 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);//it will receive input from user through console
	// take first number
	System.out.println("Enter 1st number");
    int num1 = scan.nextInt();//scan it is the reference variable
    //it will take actual integer data from user through console(Above line shows)
    //take second number
    System.out.println("Enter second number");
     int num2 = scan.nextInt();
     //Addition of two numbers
     System.out.println("Addition"+(num1+num2));
  }
}
	
    
	        
	        
		

