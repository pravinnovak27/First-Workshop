package com;
import java.util.*;
public class MinMax {
    public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[10];
       System.out.println("Entering values in the array");
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<=9;i++)
       {
         arr[i]=sc.nextInt();
         if(arr[i]<min)
           {
           min=arr[i];
           }
         if(arr[i]>max)
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum value is "+max);
       System.out.println("Minimum value is "+min);
       sc.close();
       
       
  }
}
