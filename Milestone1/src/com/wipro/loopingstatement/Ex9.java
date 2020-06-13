package com.wipro.loopingstatement;

public class Ex9 {
        public static void main(String[] args) {
        	int n=Integer.parseInt(args[0]);
        	int p=n;
    		int sum=0,r;
    		while(n!=0)
    		{
    			r=n%10;
    			sum=sum*10+r;
    			n=n/10;
    		}
    		if(sum==p)
    		{
    			System.out.println(p+" is a palindrome"); 
    			
    		}
    		else
    		{
    			System.out.println(p+" is not a palindrome");
    		}
}
}
