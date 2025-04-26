package ContestProblems.ContestProblems;

import java.util.HashMap;
import java.util.Map.Entry;

class maxDiffEvenOdd {
    public int maxDifference(String s) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(Entry<Character, Integer> x:a.entrySet()){
            int value = x.getValue();
            if(value%2==1){
                maxOdd = Math.max(maxOdd,value);
            }else{
                minEven = Math.min(minEven,value);
            }
        }
        return maxOdd-minEven;
    }
}