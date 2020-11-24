package com.faang.ArraysSet1;

public class MooreElement {

        public static  int majorityElement(int[] nums) {

            int maj = nums[0];
            int c = 0;
            for( int i= 0; i < nums.length; i++)
            {
                if(maj == nums[i])
                    c++;
                else
                    c--;
                if(c==0)
                {
                    maj = nums[i];
                    c = 1;
                }

            }

            return maj;
        }

        public static void main(String args[])
        {
            int[] nums = new int[]{3,2,4,2,3,4,4};
            System.out.println(majorityElement(nums));
        }
    }





