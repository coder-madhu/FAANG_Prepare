package com.faang.ArraysSet1;

public class ExcelSheetColumn {

    public static int  titleToNumber(String s) {

        int p =0,sum =0;

        for( int i= s.length()-1; i>=0; i--)
        {
            sum += (s.charAt(i)-64)*Math.pow(26,p);
            p++;
        }

        return sum;
    }

    public static void main(String args[])
    {
        String s ="AA";
        System.out.println(titleToNumber(s));


    }
}

