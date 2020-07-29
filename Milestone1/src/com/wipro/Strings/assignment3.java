package com.wipro.Strings;
import java.util.Scanner;

public class assignment3 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	int l = str.length();
	str = str.substring(0, 2);
	String str1 ="";
	for(int i=0;i<l;i++) {
		str1=str1+str;
	}
	System.out.println(str1);
}
}