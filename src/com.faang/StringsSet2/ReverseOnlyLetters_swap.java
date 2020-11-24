package com.faang.StringsSet2;

public class ReverseOnlyLetters_swap {
    public String reverseOnlyLetters(String S) {
        char[] c = S.toCharArray();
        int i =0;
        int j = S.length()-1;

        while (i < j ){

            while( i < j && !Character.isLetter(S.charAt(i)))
            {
                i++;
            }

            while( i < j && !Character.isLetter(S.charAt(j)))
            {
                j--;
            }

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;

        }

        return new String(c);
    }
}