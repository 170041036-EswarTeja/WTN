package com.wipro.arrays;

public class Ex13 {
         public static void main(String[] args) {
       	  int []a=new int[]{7,1,2,3,6};
       	int s=0, d=0;
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]==6){
					for(int j=a.length-1;j>=0;j--)
					{
						if(a[j]==7) {
						d=d+a[j];
						}
					}
				}
				s=s+a[i];
			}
			System.out.println(s);
		}
}
