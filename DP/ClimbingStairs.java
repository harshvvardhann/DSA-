package DP;
import java.util.HashMap;
import java.util.Map;
// Space Optimization
class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<=1) return 1;

        int a = 1,b = 1;

        for(int i=2;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }
}

// Memoization(memoize the recursive calls to avoid recomputation of same subproblems multiple times)
class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> hm = new HashMap<>();
        return climbStairs(n,hm);
    }

    public int climbStairs(int n,Map<Integer,Integer> hm){
        if(n<=1) return 1;

        if(!hm.containsKey(n)){
            hm.put(n,climbStairs(n-1,hm) + climbStairs(n-2,hm));
        }

        return hm.get(n);
    }
}