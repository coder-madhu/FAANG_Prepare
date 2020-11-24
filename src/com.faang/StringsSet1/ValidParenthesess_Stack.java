package com.faang.StringsSet1;

import java.util.Stack;

public class ValidParenthesess_Stack {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c: s.toCharArray())
        {
            if( c =='{' || c =='[' ||c =='('){
                st.push(c);
            }else
            {
                if(st.isEmpty())
                    return false;

                if(c =='}' && st.pop() !='{')
                    return false;
                if(c ==']' && st.pop() !='[')
                    return false;
                if(c ==')' && st.pop() !='(')
                    return false;
            }
        }

        return st.isEmpty();
    }
}

