package com.faang.DP;

public class LongestPalindromicSubsequence {

        public static int longestPalindromeSubseq(String s)
        {
            int dp[][]=new int[s.length()][s.length()];

            //Since for string of length 1,LPS is 1.
            for(int i=0;i<s.length();i++)
                dp[i][i]=1;

            for(int itr=1;itr<s.length();itr++)
            {
                for(int l=0,h=itr;h<s.length();l++,h++)
                {
                    if(s.charAt(l)==s.charAt(h))
                        dp[l][h]=2+dp[l+1][h-1];
                    else
                        dp[l][h]=Math.max(dp[l+1][h],dp[l][h-1]);
                }
            }
            return dp[0][s.length()-1];
        }

    public static void main(String args[])
    {
        String seq = "GEEKSFORGEEKS";
        int n = seq.length();
        System.out.println("The length of the lps is "+ longestPalindromeSubseq(seq));
    }
}

// O(n2) // O(n)