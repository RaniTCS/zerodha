package Logical_Programs;

import java.util.Scanner;

public class Replace_All_special_char_in_String
{
    public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name with Special character");
		String name = scan.next();//next() it is used  in String
		String actname=name.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(actname);
		
		
	}
}
