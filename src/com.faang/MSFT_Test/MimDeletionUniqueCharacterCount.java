package com.faang.MSFT_Test;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        
        Map<Character, Integer> charCount = new HashMap<>();
        int maxFreq = 0;
        for (Character ch : S.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, charCount.get(ch));
        }
        
        int[] collisionCount = new int[maxFreq+1];
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            collisionCount[entry.getValue()]++;
        }
        
        int level = maxFreq;
        int removal = 0;
        while (level > 0) {
            int collision = collisionCount[level];
            if (collision > 1) {
                collisionCount[level-1] += collision-1;
                removal += collision-1;
            }
            level--;
        }
        return removal;
    }
}
