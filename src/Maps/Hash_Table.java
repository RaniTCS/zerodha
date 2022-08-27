package Maps;

import java.util.Hashtable;
import java.util.Set;

public class Hash_Table 
{
   public static void main(String[] args)
   {
	   Hashtable<Integer,String> ht=new Hashtable<Integer,String> ();
	   ht.put(101, "Rajashri");//1st entry
	   ht.put(102, "Bhagyashri");//2nd entry
	   ht.put(103, "Dhanashri");//3rd entry
	   ht.put(104, "Darshana");//4rth entry
	   //using cursor iterator
	   Set s=ht.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		//using for each loop
	for( int k:ht.keySet()) {
		System.out.println(k+" "+ht.get(k));
		
	}	
}
}
