package com.wipro.Strings;
import java.util.*;
public class assignment9 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	String str1 = s.nextLine();
	String str2 = s.nextLine();
	String result = "";
	if (str1.length() == str2.length()) {
		for (int  i = 0;i < str1.length();i++) {
				result += String.valueOf(str1.charAt(i));
				result += String.valueOf(str2.charAt(i));
		}
	}
	else if (str1.length() < str2.length()) {
		for (int  i = 0;i < str1.length();i++) {
				result += String.valueOf(str1.charAt(i));
				result += String.valueOf(str2.charAt(i));
		}
			result +=  str2.substring(str1.length());
}
	else {
		for (int  i = 0;i < str2.length();i++) {
				result += String.valueOf(str1.charAt(i));
				result += String.valueOf(str2.charAt(i));
		}
			result +=  str1.substring(str2.length());
	}
	System.out.println(result);
}
}