package com.wipro.arrays;

public class Ex2 {
         public static void main(String[] args) {
        	 int a[] = new int[] {11,2,3,4,5,6,7};
             int min = a[0];
             int max = a[0];
            
             for(int i=1; i< a.length; i++)
             {
                     if(a[i] > max)
                             max = a[i];
                     else if (a[i] < min)
                             min = a[i];
                    
             }
            
             System.out.println("minimum: " + min);
             System.out.println("maximum: " + max);
 			}
		}
 			
