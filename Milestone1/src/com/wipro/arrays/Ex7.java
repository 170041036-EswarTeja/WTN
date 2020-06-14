package com.wipro.arrays;

public class Ex7 {
        public static void main(String[] args)
        { 
			int[][] a=new int[3][3];
			int max=a[0][0];
			int k=0;
       for (int i=0;i<3;i++)
			{   
				for(int j=0;j<3;j++)
				{
					int x=Integer.parseInt(args[k]);   
					a[i][j]=x;
					k++;
				} 
			}
       for (int i=0;i<3;i++)
		{   
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
	}
       System.out.println(max);
		}
}
