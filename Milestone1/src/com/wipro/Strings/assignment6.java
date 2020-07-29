package com.wipro.Strings;
import java.util.Scanner;
public class assignment6 {
     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
		{
			System.out.println(s1+s2+s1);
		}
		else
		{
			System.out.println(s2+s1+s1);
		}
	}
}
