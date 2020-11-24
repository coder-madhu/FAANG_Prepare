package com.faang.StringsSet1;

public class palindrome_permutation {
    public boolean canPermutePalindrome(String s) {
        if(s == null || s.length() == 1)
            return true;
        int[] char_count = new int[128];
        for(int i = 0; i < s.length(); i++)
        {
            char_count[s.charAt(i)]++;
            System.out.println(s.charAt(i));
        }

        int c =0;
        for( int i=0; i<char_count.length;i++ )
            c+= char_count[i]%2;

        return c <=1;


    }
}