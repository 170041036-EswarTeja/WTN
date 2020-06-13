package com.wipro.ifelsestatement;

public class Ex6 {
         public static void main(String[] args) {
        	 char c=args[0].charAt(0);
			int a=Integer.parseInt(args[1]);
			if((c=='F') && (a>1&&a<58)) {
				System.out.println("the percentage of interest is 8.2%");}
			if((c=='F')&& (a>59&&a<100)) {
				System.out.println("the percentage of interest is 9.2%");}
			if((c=='M')&& (a>1&&a<58)) {
				System.out.println("the percentage of interest is 8.4%");}
			if((c=='M')&& (a>59&&a<100)) {
				System.out.println("the percentage of interest is 10.5%");}
			
		}
}
