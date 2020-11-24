package com.faang.StringsSet1;

public class StringReverse {
        public void reverseString(char[] s) {

            if (s == null || s.length == 0 ||  s.length == 1)
            {
                System.out.println(s);
            }
            int  f =0, e= s.length-1;

            char temp;

            while(f <= e)
            {

                temp = s[f];
                s[f] = s[e];
                s[e] = temp;

                f++;
                e--;
            }

            System.out.println(s);


        }
    }
