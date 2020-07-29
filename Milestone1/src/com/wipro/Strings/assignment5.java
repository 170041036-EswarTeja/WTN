package com.wipro.Strings;
import java.util.Scanner;
public class assignment5 {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int l=str.length();
	String str1=str.substring(1,l-1);
	System.out.println(str1);
}
}
