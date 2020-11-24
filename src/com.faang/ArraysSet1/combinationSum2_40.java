package com.faang.ArraysSet1;

import java.util.*;

public class combinationSum2_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,0,target,new ArrayList<Integer>(), result);
        return result;

    }

    public void  findCombination(int[] candidates, int index,int target,List<Integer> current, List<List<Integer>> result)
    {

        if(target == 0)
        {
            result.add(new ArrayList<>(current));

        }
        if(target < 0)
            return ;

        for( int i = index; i < candidates.length; i++)
        {
            if( i == index || candidates[i] != candidates[i-1])
            {
                current.add(candidates[i]);
                findCombination(candidates, i+1, target -candidates[i], current, result);
                current.remove(current.size() -1);
            }
        }

    }
}
