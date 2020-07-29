package com.wipro.Strings;
import java.util.Scanner;
public class assignment4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int l=str.length();
		if(l%2==0)
		{
			String Str1=str.substring(0,l/2);
			System.out.println(Str1);
			
		}
		else
		{
			System.out.println("null");
		}
		
	}
}
