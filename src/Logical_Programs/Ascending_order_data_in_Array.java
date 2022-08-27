package Logical_Programs;

import java.util.Arrays;

public class Ascending_order_data_in_Array
{
   public static void main(String[] args) 
   {
	   int ar[]= {90,49,55,39,20,10};
	   
	   //print data in ascending order
	   Arrays.sort(ar);
	   for(int i=0;i<=ar.length-1;i++)//in array length-1 is used (in string length()-1 is used)
	   {
		   System.out.println(ar[i]);
	   }
	   
	
}
}
