package com.faang.StringsSet1;

public class LengthOfLastWord {
        public static int lengthOfLastWord(String s) {

            int len = s.length();
            int c =0;

            if(s==null || s.length()==0) {
                return 0;
            }

            for(int i = len-1; i>=0 ; i--)
            {

                if (s.charAt(i) != ' ')
                    c++;
                else if( c > 0)
                    return c;



            }

            return c;
        }

    public static void main(String args[])
    {
        // String s ="AA";
        System.out.println(lengthOfLastWord("Hello India"));


    }
    }

