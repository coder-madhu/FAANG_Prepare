package com.faang.SpecialCases;

import java.io.*;
import java.util.*;

public class  MaxSumValue {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod=(long)1e9+7;
        while(t--!=0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long[]ar=new long[10000000];int i;
            for(i=0;i<a;i++)
            {
                ar[i]=sc.nextLong();
            }
            int start=0;
            int end=0;float avg=0,realavg=0; float min=0;long sum=0,maxsum=Long.MIN_VALUE;
            while(end<a)
            {

                sum=sum+ar[end];

                if(end>b-2)
                {
                    avg=sum/(float)b;
                    if(sum>maxsum)
                    {
                        maxsum=sum;
                    }
                    sum=sum-ar[start];
                    start=start+1;

                }
                end++;
            }
            System.out.printf("%.3f\n",maxsum/(float)b);
        }
    }
}