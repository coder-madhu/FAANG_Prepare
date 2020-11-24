package com.faang.StringsSet1;

public class PalindromeString {


        public boolean isAlapnum(char a)
        {
            if(Character.isDigit(a) || Character.isLetter(a))
                return true;
            else
                return false;

        }

        public boolean isPalindrome(String s) {

            int e = s.length()-1;
            int f = 0;

            if(s.length()== 0 || s == null)
                return true;

            while(f<=e)
            {
                while(f <=e && !isAlapnum(s.charAt(f)))
                {
                    f++;
                }
                while(f<=e && !isAlapnum(s.charAt(e)))
                {
                    e--;
                }
                if(f<=e && Character.toLowerCase(s.charAt(f)) != Character.toLowerCase(s.charAt(e)))
                {
                    return false;
                }
                f++;
                e--;

            }
            return true;

        }

    }



