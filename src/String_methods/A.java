package String_methods;

public class A 
{
   public static void main(String[] args)
   {
	   String s1="velocity";
	   String s2="VELOCITY";
	   String s3="velo";
	 //length()>>>>gives count of character of the String
	   System.out.println(s1.length());
	   System.out.println(s2.length());
	   //toUpperCase>>>>>convert lower string to upper case
	   System.out.println(s1.toUpperCase());
	   
	   //toLowerCase >>>>.convert upper to lower case
	   System.out.println(s2.toLowerCase());
	   
	   //equals()>>>>it will compare to string
	   
	   System.out.println(s1.equals(s2));//gives false result because small and capital 
	   
	   //equalsIgnoreCase()>>>it will compare two strings ignoring there cases
	   
	   System.out.println(s1.equalsIgnoreCase(s2));//return true result
       //contains()>>It will check for characters inside string
	   
	   System.out.println(s1.contains(s3));
	   
	   //charAr()>>>.it will give character of String of perticular position(SIOOBE)
	   System.out.println(s1.charAt(7));
	   
	   //indexOf()>>>>it will give index of perticular character
	   System.out.println(s1.indexOf('v'));
	   System.out.println(s2.indexOf('T'));
	   
	   //lastIndexOf()>>>It will give last index of string
	   System.out.println(s1.lastIndexOf('t'));
	   
	   //startWith()>>>>it will check our string start with perticular character
	   
	   System.out.println(s1.startsWith("ve"));
	   System.out.println(s2.startsWith("LO"));
	   
	   //endsWith()>>>>it will check our string ends with perticular character
	   
	   System.out.println(s1.endsWith("ty"));
	   System.out.println(s2.endsWith("rt"));
	   
	   //subString>>>>It will break the string and Display
	   System.out.println(s1.substring(4));
	   System.out.println(s2.substring(4));
	   
	   //concat()>>>>to join two strings
	   System.out.println(s1.concat(s3));
	   System.out.println(s2.concat(s1));
	   
	   //replace()>>>>it will replace the collection of characters
	   System.out.println(s1.replace("city", "rural"));
	   
	   
	   //contains()----check small and capital also if match then true otherwise false
	   System.out.println(s1.contains(s2));
	   
	   
	   
	
}
}
