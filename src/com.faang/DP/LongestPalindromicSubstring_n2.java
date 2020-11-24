package com.faang.DP;

public class LongestPalindromicSubstring_n2 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // odd substring check
            int len2 = expandAroundCenter(s, i, i + 1);// even substring check
            int len = Math.max(len1, len2);
            if (len > end - start) {  // holding previous length of the substring
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) { // Exapnding it from middel
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

}

// odd and even
// by reaching the middle it will check entire string  O(n2)/ O(1)