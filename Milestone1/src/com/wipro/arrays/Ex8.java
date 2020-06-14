package com.wipro.arrays;

public class Ex8 {
          public static void main(String[] args) {
			int []a=new int[] {12,34,12,45,67,89,78,45,34};
			int n=a.length;
			for(int i=0;i<n;i++)
			{
				int k=0;
				for(int j=i;j>=0;j--)
				{
					if(a[i]==a[j])
						k++;
				}
				if(k<=1)
				{
					System.out.println(a[i]+" ");
				}
			}	
}
}