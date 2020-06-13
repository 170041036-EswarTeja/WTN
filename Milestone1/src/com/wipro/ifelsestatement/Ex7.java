package com.wipro.ifelsestatement;

public class Ex7 {
       public static void main(String[] args) {
		char c=args[0].charAt(0);
		if(c>='a'&&c<='z')
		{
			System.out.println(c+"->"+Character.toUpperCase(c));
		}
		if(c>='A'&&c<='Z')
		{
			System.out.println(c+"->"+Character.toLowerCase(c));
		}
	}
}
