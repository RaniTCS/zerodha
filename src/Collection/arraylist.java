package Collection;

import java.util.ArrayList;

public class arraylist 
{
   public static void main(String[] args) 
   {
	   ArrayList al=new ArrayList();
	   al.add("Ganesh");
	   al.add(100);
	   al.add('A');
	   al.add(100);
	   al.add(null);
	   System.out.println(al);//it will print entire data in array 
	   System.out.println(al.size());//it will give size of array
	   System.out.println(al.contains(100));//contains() is used whether that element is present or not in array
	   System.out.println(al.isEmpty());//check whether our array is empty or not(result in true/false
	   al.add(2,200);// gives second postion add 200
	   System.out.println(al.get(2));//printing array with 200 in right shift operator
	   System.out.println(al);//after changes will print entire array
	   al.remove(3); // remove 3rd position element from array
	   System.out.println(al);//again print entire array
	   
	   
}
}
