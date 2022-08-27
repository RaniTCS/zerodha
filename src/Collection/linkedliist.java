package Collection;

import java.util.LinkedList;

public class linkedliist 
{
   public static void main(String[] args) 
   {
	   LinkedList ll=new LinkedList();  //ll(el el) is reference variable
	   ll.add("Ankush");
	   ll.add('D');
	   ll.add("Awantika");
	   ll.add("Ankush");//duplicate allow
	   ll.add(100);
	   ll.add(null);
	   ll.add(null);
	   System.out.println(ll.size());
	   System.out.println(ll);
	   System.out.println(ll.get(6));
	   System.out.println(ll.get(5));
	   System.out.println(ll.contains(200));
	   System.out.println(ll.isEmpty());
	   System.out.println(ll.get(2));
	   //insertion in ll(right shift operator
	   ll.add(0,"Dhiraj");
	   System.out.println(ll);
	   //remove(left shift operator)data from collection
	   ll.remove(0);//remove 0th index from 
	   System.out.println(ll);
	   //modication/updation/replace
	   ll.set(0, "Pravina");
	   System.out.println(ll);
	   
	   
	   
	   
	
}
}
