package com.faang.ArraysSet1;
import java.util.ArrayList;
import java.util.List;

public class LetterCombination_phoneNumber {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0)
        {
            return result;
        }

        String[] mapping = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"

        };

        letterComnRecursive(result, digits," ", 0, mapping);
        return result;
    }



    public void letterComnRecursive(List<String> result, String digits, String current, int index, String[] mapping)
    {
        if( index == digits.length())
        {
            result.add(current);
            return;
        }

        String letters = mapping[digits.charAt(index) -'0'];
        for(int i=0; i < letters.length(); i++)
        {
            letterComnRecursive(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }

}


