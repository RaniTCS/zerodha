package Set;

import java.util.HashSet;

public class hashset// class name small becoz inbuilt class
{
   public static void main(String[] args)
   {
	   HashSet hs=new HashSet();//object create
	   hs.add("RAJASHRI");
	   hs.add(100);
	   hs.add(null);
	   hs.add(null);//only one null value will print duplicate not allow
	   hs.add(100);//only one duplicate will print(duplicates size not consider)
	   hs.add('R');
	   System.out.println(hs);
	   System.out.println(hs.isEmpty());//false
	   System.out.println(hs.contains(100));//true
	   System.out.println(hs.size());//3
	   
	   
	
}
}
