package Logical_Programs;

public class String_Reverce
{
  public static void main(String[] args) 
  {
	  String org="Rajashri";
	  String rev=" ";
	  for(int i=org.length()-1;i>=0;i--)
	  {
		  rev=rev+org.charAt(i);
	  }
	  System.out.println(rev);
	
}
}
