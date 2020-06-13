package com.wipro.arrays;

public class Ex1 {
         public static void main(String[] args) {
			int[]a=new int[] {1,2,3,4,5,6,7};
			int sum=0,avg;
			int l=a.length;
			for(int i=0;i<l;i++)
			{
				sum=sum+a[i];
			}
			avg=sum/l;
			System.out.println("sum="+sum);
			System.out.println("average="+avg);
		}
}
