package com.faang.ArraysSet1;

public class RemoveDuplicates {
    //Remove the key
        public int removeDuplicates(int[] nums) {

            int index = 1;

            for ( int i =0; i< nums.length-1; i++)
            {
                if(nums[i] != nums[i+1])
                {
                    nums[index] = nums[i+1];
                    index++;
                }
            }

            return index;

        }
    }