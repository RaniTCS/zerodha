package Set;

import java.util.LinkedHashSet;//package name

public class linkedhashset //class name
{
 public static void main(String[] args) 
 {
	 LinkedHashSet lhs=new LinkedHashSet();//lhs---is reference variable
	 lhs.add("Darshana");
	 lhs.add(100);
	 lhs.add('R');
	 lhs.add(100);
	 lhs.add(null);
	 lhs.add(null);
	 System.out.println(lhs.size());//to gate size of linke dhash set
	 System.out.println(lhs.isEmpty());
	 System.out.println(lhs.contains('R'));
	 System.out.println(lhs.contains('P'));
	 System.out.println(lhs);
	 System.out.println(lhs.contains('S'));//false
	 
	 
	 
	 
	
}
}
