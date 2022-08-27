package Collection;

import java.util.Vector;

public class vectors 
{
  public static void main(String[] args) 
  {
	  Vector v=new Vector();
	  v.add("Rajashri");
	  v.add(100);
	  v.add('R');
	  v.add(null);
	  v.add(null);
	  v.add("Rajashri");
	  v.add(100);
	  System.out.println(v.size());//check size
	  System.out.println(v.isEmpty());//check whether is empty or not
	  System.out.println(v.contains(200));//false
	  System.out.println(v.capacity());//to check capcity
	  System.out.println(v.get(3));//index fetch the value
	  //insertion of element(Right shift operator)
	  v.add(0,"Dhanashree");
	 System.out.println(v);
	 //remove the data(left shift)
	 v.remove(0);
	 System.out.println(v);
	 //modify,replace,update
	 v.set(2, 'D');
	 System.out.println(v);
	 
	 
	  
	 
	  
	 
	  
	  
	
}
}
