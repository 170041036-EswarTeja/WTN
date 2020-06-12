package com.wipro.ifelsestatement;

public class Ex3 {
           public static void main(String[] args) {
			int c= args.length;
			if (c==0)
			{
				System.out.println("No Value");
			}
			else
			{
			 for(int i=0;i<c;i++)
			 {
				 System.out.print(args[i]);
				 if(i<c-1) {
				 System.out.print(",");
			 }
			 }
			}
           }
           
}
