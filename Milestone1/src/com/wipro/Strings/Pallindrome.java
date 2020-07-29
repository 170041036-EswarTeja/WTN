package com.wipro.Strings;
import java.util.*;
public class Pallindrome {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(str.contentEquals(sb)) {
			System.out.println( str + " is palindrome ");
		}
		else {
			System.out.println( str + " is not palindrome ");
		}
	}

}
