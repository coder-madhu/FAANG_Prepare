package com.faang.Metrices;

public class LmatrixPrint {

    void print(int a[][])
    {
        int n = a.length;
        int m= a[0].length;
        for( int i =0; i < n; i++)
        {
            for ( int j = 0; j< n; j++)
            {
                if( j== 0 || i == n-1)
                    System.out.println(a[i][j]);
            }
        }
    }
}


