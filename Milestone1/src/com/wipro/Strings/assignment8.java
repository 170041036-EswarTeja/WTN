package com.wipro.Strings;
import java.util.Scanner;
public class assignment8 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0;i < str.length();i++) {
			if (i == 0 && str.charAt(i) == '*') {
				sb.delete(i, i + 1);
			}
			else if ((i > 0 && i < str.length() - 1) && str.charAt(i) == '*') {
				sb.delete(i - 1, i + 2);
			}
			else if (i == str.length() - 1 && str.charAt(i) == '*') {
				sb.delete(i - 1, str.length());
			}
		}
		System.out.println(sb);
	}

}
