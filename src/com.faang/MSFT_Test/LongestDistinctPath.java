// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
/*
import java.util.*;
class Solution1 {
    
    private int longestDistinctPath(Tree T, HashSet<Integer> visited) {
        
        if (T == null || visited.contains(T.x)) {
            return visited.size();
        }
        
        visited.add(T.x);
        int maxLen = Math.max(longestDistinctPath(T.l, visited), longestDistinctPath(T.r, visited));
        visited.remove(T.x);
        return maxLen;
    }
    
    
    public int solution(Tree T) {
        // write your code in Java SE 8
        return longestDistinctPath(T, new HashSet<>());
    }
}
*/