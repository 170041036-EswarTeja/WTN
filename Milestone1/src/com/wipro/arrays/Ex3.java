package com.wipro.arrays;

public class Ex3 {
     public static void main(String[] args) {
		int[]a=new int[]{1,4,34,56,7};
		int n=Integer.parseInt(args[0]);
		int c=0,i;
		for( i=0;i<a.length;i++)
		{
			if(a[i]==n) {
				c=1;
				break;
			}
			else
			{
				c=0;
			}
		}
		if(c==1)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("-1");
		}
	}
}
