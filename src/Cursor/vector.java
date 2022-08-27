package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class vector 
{
   public static void main(String[] args)
   {
	   Vector v=new Vector();
	   v.add("Rajashri");
	   v.add('R');
	   v.add(100);
	   v.add(null);
	   Enumeration en = v.elements();
	   while(en.hasMoreElements())
	   {
		   System.out.println(en.nextElement());
	   }
	   for(Object s1:v) {          //for each loop(v is reference variable,s1 is also variable
			System.out.println(s1);
		}
		
	
}
}
