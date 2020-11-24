package com.faang.StringsSet2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TC: O(n * n) * avg length subString
// SC: O(n)



public class WordBreakSet1 {

    public boolean wordBreak(String s, List<String> wordDict)
    {
         int n = s.length();
         boolean[] dp= new boolean[n+1];
         dp[0] = true;
         Set<String> wordSet = new HashSet<>(wordDict);

         for( int lo =0; lo < n; lo++) {
             if (!dp[lo]) continue;
             for (int hi = lo + 1; hi <=n ; hi++)
             {
                 String subStr = s.substring(lo, hi);
                 if(wordSet.contains(subStr)){
                     dp[hi] = true;
                 }
             }


         }
         return dp[n];

    }


}
