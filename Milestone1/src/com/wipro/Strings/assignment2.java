package com.wipro.Strings;

import java.util.Scanner;

public class assignment2 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	String str1 = s.nextLine().toLowerCase();
	String str2 = s.nextLine().toLowerCase();
	if(str1.charAt(str1.length() - 1) == str2.charAt(0)) {
		System.out.println(str1+str2.substring(1));
	}
	else {
		System.out.println(str1+" "+str2);
	}
}
}
