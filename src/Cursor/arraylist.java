package Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist
{
    public static void main(String[] args)
    {
		ArrayList al=new ArrayList();
		al.add("Rajashri");
		al.add(null);
		al.add('R');
		al.add(100);
		Iterator itr = al.iterator();// fetch data using using universal cursor(Iterator)
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object s1:al)//for each loop
		{
			System.out.println(s1);
		}
	}
}
