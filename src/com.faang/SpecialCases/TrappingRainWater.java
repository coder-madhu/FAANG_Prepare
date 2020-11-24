package com.faang.SpecialCases;

public class TrappingRainWater {
    public static int trap(int[] height) {

        if(height == null || height.length == 0)
            return 0;
        int result = 0, level = 0, left = 0 ,right = height.length-1;
        while(left <right)
        {
            int lower = height[height[left] < height[right] ? left++ : right--];
            level = Math.max(level,lower);//1, 0/1 , 2
            result += level -lower; //0, 1,0/1,1
        }

        return result;

    }

    public static void main(String[] args)
    {
        int[] ip= new int[]{1,0,2,1,0,1,3};
        System.out.println(trap(ip));
    }
}