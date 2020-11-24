package com.faang.ArraysSet1;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

        public static List<String> fizzBuzz(int n) {

            List<String> lst = new ArrayList<String>();

            for ( int i =1; i<=n; i++)
            {
                if(i%3 == 0 && i%5 !=0)
                {
                    lst.add("Fizz");
                }
                else if(i%5 == 0 && i%3 != 0)
                {
                    lst.add("Buzz");
                }
                else if(i%3 == 0 && i%5 ==0)
                {
                    lst.add("FizzBuzz");
                }
                else
                    lst.add(Integer.toString(i));
            }

            return lst;

        }

    public static void main(String args[])
    {
       // String s ="AA";
        System.out.println(fizzBuzz(15));


    }
    }


