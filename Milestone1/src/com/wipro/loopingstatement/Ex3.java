package com.wipro.loopingstatement;

public class Ex3 {
         public static void main(String[] args) {
			int n=Integer.parseInt(args[0]);
			int c=0;
			for(int i=2;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
				if(c==1)
				{
					System.out.println("prime");
				}
				else
				{
					System.out.println("Not A Prime");
				}
			}
}
