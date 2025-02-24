package ContestProblems.ContestProblems;

import java.util.HashMap;

public class maximumFrequencyAfterSubarrayOp {
    public static int maxFrequency(int[] arr,int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = Math.abs(arr[i]-k);
            map.put(x, map.getOrDefault(x, 0)+1);
            System.out.println(map);
        }
        // Track the maximum frequency and its corresponding key
        int maxFrequency = 0;
        int keyWithMaxFrequency = -1; // Initialize to an invalid value

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > maxFrequency) {
                maxFrequency = freq; // Update max frequency
                keyWithMaxFrequency = key; // Update key corresponding to max 
                System.out.println("KEY:"+keyWithMaxFrequency);
            }
        }
        System.out.println("Key with Max Frequency: " + keyWithMaxFrequency);
        System.out.println("Max Frequency: " + maxFrequency);
        return maxFrequency;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int ans = maxFrequency(nums,1);
        System.out.println(ans);
    }
}
