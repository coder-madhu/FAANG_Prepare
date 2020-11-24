package com.faang.StringsSet1;
import java.util.*;

public class ReversePolishNotation {
        public int evalRPN(String[] tokens) {
            Stack<Integer> s = new Stack<>();
            for (String str : tokens) {
                if (!str.equals("+") && !str.equals("-") && !str.equals("*") &&!str.equals("/")) {
                    s.push(Integer.valueOf(str));
                }
                else {
                    int num2 = s.pop();
                    int num1 = s.pop();
                    int num = 0;
                    if (str.equals("+")) {
                        num = num1 + num2;
                    }else if (str.equals("-")) {
                        num = num1 - num2;
                    }else if (str.equals("*")) {
                        num = num1 * num2;
                    }else {
                        if (num2 == 0) {
                            s.push(num1);
                            break;
                        }
                        num = num1 / num2;
                    }
                    s.push(num);
                }
            }
            return s.pop();
        }
    }

