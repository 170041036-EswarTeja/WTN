package com.wipro.arrays;

public class Ex4 {
       public static void main(String[] args) {
    	   int a[] =new int[] {67,120,90,98};
           String str =null;
           for(int i:a){
               str = Character.toString((char)i);
               System.out.print(str+" ");
           }
	}
}
