package com.wipro.loopingstatement;

public class Ex6 {
        public static void main(String[] args) {
		   int n=Integer.parseInt(args[0]);
		       int sum=0 ,r,i;
		   for(i=n;i!=0;i=i/10)
		   {
			 r=i%10;
			 sum=sum+r;
		   }
		  System.out.println(sum);
}
}