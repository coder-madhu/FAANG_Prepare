package com.faang.StringsSet1;

public class LongestComPrefix {

        public static String longestCommonPrefix(String[] strs) {


            String p = "";
            if (strs.length < 1) {
                 return p;
            }

            String str = strs[0];
            for (int i = 0; i < strs.length; i++) {
                if (str.length() > strs[i].length())
                    str = strs[i];
            }

            int v = 0;
            int c = str.length();
            boolean flag = true;
            System.out.println(str);
            while (v < c) {
                for (int i = 0; i < strs.length; i++) {
                    if (str.charAt(v) != strs[i].charAt(v))
                        flag = false;
                }
                if (flag == true) {
                    p = p + str.charAt(v);
                } else
                    return p;
                v++;

            }

            return p;
        }

            public static void main(String args[])
            {
                String[] strs = new String[]{"flower","flow","flight"};
                System.out.println(longestCommonPrefix(strs));
            }


        }




