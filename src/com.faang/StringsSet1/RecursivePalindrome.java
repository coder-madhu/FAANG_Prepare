package com.faang.StringsSet1;

import java.util.Scanner;

public class RecursivePalindrome {
    public static void main(String args[]){
        System.out.println("Enter the input");
        Scanner input = new Scanner(System.in);
        String s= input.nextLine();

        if(isPalindrome(s)){
            System.out.println(s+" is a palindrome");
        }
        else
            System.out.println(s+" is not a palindrome");


    }
    public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));

           return false;
    }
}
