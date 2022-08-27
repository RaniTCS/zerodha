package PRACTICE;

import java.util.ArrayList;

public class arraylist //inbuilt class so doesn't matter it will be small or capital
{
   public static void main(String[] args)
   {
	   ArrayList al=new ArrayList();
	   al.add("Rajashri");
	   al.add(100);
	   al.add('R');
	   al.add(100);
	   al.add(5);
	   System.out.println(al);
	   System.out.println(al.size());
	   System.out.println(al.contains(5));
	   System.out.println(al.isEmpty());
	   al.add(2,200);
	   System.out.println(al.get(2));
	   System.out.println(al);
	   al.remove(0);
	   System.out.println(al);
	}
}
