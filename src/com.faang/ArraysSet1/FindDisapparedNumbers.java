package com.faang.ArraysSet1;

import java.util.*;

public class FindDisapparedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> missingNumbers = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for ( int i: nums)
        {
            set.add(i);
        }

        for( int i= 1; i <= nums.length; i++)
        {
            if(!set.contains(i))
            {
                missingNumbers.add(i);

            }
        }

        return missingNumbers;

    }
}