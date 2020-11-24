package com.faang.StringsSet2;
/*
Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 */
public class StringCompression
{
    public int compress(char[] chars)
    {
        int index = 0;
        int i = 0;
        while( i < chars.length)
        {
            int j = i;
            while ( j < chars.length && chars[i] == chars[j])
            {
                j++;
            }

            chars[index++] = chars[i];
            if( j-i > 1)
            {
                String count = j-i+"";
                for( char c: count.toCharArray())
                {
                    chars[index++] = c;
                }
            }
            i =  j;
        }

        return index;

    }
}