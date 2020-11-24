package com.faang.DP;

import java.util.*;

public class minCostPathDP{

    static int[][] matx = null;
    static int dp[][] = null;
    static int R = 0;
    static int C=0;

    static int minCostPathValue(int[][] matr,int i, int j)
    {
//int mat[R][C];
// 1. Take Storage
// 2. Init dp with a SENTINEL_VALUE value that can't be the answer at all.
//int maxPathSum(int i, int j)
//{
// BOUNDARY - Conservative Check
        if(i<0 || i>=R || j<0 || j>=C)
            return Integer.MIN_VALUE;
// Leaf returns ans directly
        if(i==R-1 && j==C-1)
            return matr[i][j];
        if(dp[i][j] != Integer.MIN_VALUE)
            return dp[i][j];
// Get Down Ans
        int da = minCostPathValue(matr,i+1, j);
// Get Right Ans
        int ra = minCostPathValue(matr,i, j+1);
// get dig ans
        int dig = minCostPathValue(matr,i+1, j+1);
        return dp[i][j] = matr[i][j] + Math.min(da, Math.min(ra,dig));
    }



    static void loadMatrix(List< List<Integer> > mat){
        R = mat.size(); // Get Rows
        C = mat.get(0).size(); // Get Columns
        matx = new int[R][C];
        dp = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++)
                matx[i][j]= mat.get(i).get(j);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int r = sc.nextInt();
            int c = sc.nextInt();
// Create a List of null objects, where each object is List<Integer>
            List< List<Integer> > mat = new ArrayList<>();
// It is important to init all one dimentional arrays
            for(int i=0;i<r;i++)
                mat.add(new ArrayList<>());
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    int x = sc.nextInt();
                    mat.get(i).add(x); // Add x in the ith List to the end
                }
            }
            loadMatrix(mat);
            System.out.println(minCostPathValue(matx,0,0));
        }
    }
}