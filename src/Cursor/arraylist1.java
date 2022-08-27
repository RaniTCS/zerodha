package Cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class arraylist1 
{
   public static void main(String[] args)
   {
	   ArrayList al=new ArrayList();
	   al.add("Rajashri");
	   al.add('R');
	   al.add(100);
	   al.add(null);
	   al.add("Rani");
	  ListIterator litr = al.listIterator();//using list-iterator
	  while(litr.hasNext())
	  {
		  System.out.println(litr.next());
	  }
	  for(Object s1:al)//this is the for each loop(sl is the reference variable)and a1 is the variable)
	  {
		  System.out.println(s1);
	  }
	   
	
}
}
