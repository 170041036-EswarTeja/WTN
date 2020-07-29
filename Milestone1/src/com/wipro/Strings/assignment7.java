package com.wipro.Strings;
import java.util.Scanner;
public class assignment7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int l=str.length();
	    String s1=str.toLowerCase();
		if(s1.charAt(0)=='x'&&s1.charAt(l-1)=='x')
		{
			System.out.println(s1.substring(1,l-1));
		}
		else
		{
			System.out.println(str);
		}
		
	}
}
