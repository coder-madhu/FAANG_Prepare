package com.faang.SpecialCases;

public class TrappingTrainWaterModel2 {

   /* Calculate the water over each individual bar and add it all up to get the total amount of water among the bars.
        To get the water over a metal bar just subtract metal bar height from water level height. Do it for all the metal bars.
        Total heights could be calculated as:

        “left” array is used to store the height of the tallest metal bar on the left side of an index.

        “right” array is used to store the height of the tallest metal bar on the right side of an index.

        To calculate the water level at an index just find the minimum of the left[i] and right[i] since the water will only be present till this level.

        The last step involves the calculation of the trapped water over each metal bar and adding it all up.*/

    public int trappedwater(int[] height) {

        if (height.length <= 2)
            return 0;

        int n = height.length;

        int[] left = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
            System.out.println(left[i]);
        }

        int[] right = new int[n];
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--){
            right[i] = Math.max(right[i + 1], height[i]);
            System.out.println(right[i]);
        }

        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            ans += Math.min(left[i], right[i]) - height[i];
            System.out.println(ans);
        }

        return ans;
    }


}