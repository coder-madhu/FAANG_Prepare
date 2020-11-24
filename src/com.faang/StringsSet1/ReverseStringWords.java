package com.faang.StringsSet1;

import java.util.Stack;

public class ReverseStringWords {

    public static void main(String args[])
    {
        String sentence = " My name is Madhu";
        reverse(sentence);
    }

    public static void reverse(String sentence)
    {
        Stack<String> wordStack = new Stack<>();
        String word = "";
        for ( int i =0; i < sentence.length();i++)
        {
            if(Character.isWhitespace(sentence.charAt(i))){
                wordStack.push(word);
                word = ""; //reset the word all the time
            }

            else{
                word = word +sentence.charAt(i);
            }
        }
        wordStack.push(word);//push the last word
        while(!wordStack.isEmpty()){
            System.out.println(wordStack.pop()+" ");
        }
    }
}


