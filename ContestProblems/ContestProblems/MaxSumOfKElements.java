package ContestProblems.ContestProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class MaxSumOfKElements {
    public long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Step 1: Collect all possible elements in the heap
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]); // Sort each row in ascending order
            int rowLimit = Math.min(limits[i], grid[i].length);
            
            for (int j = 0; j < rowLimit; j++) {
                maxHeap.offer(grid[i][grid[i].length - 1 - j]); // Pick largest elements
            }
        }
        
        // Step 2: Extract 'k' largest elements from heap
        long sum = 0;
        while (k > 0 && !maxHeap.isEmpty()) {
            sum += maxHeap.poll();
            k--;
        }
        
        return sum;
    }
}

// here in this question we are given a 2-D matrix, a limits[] array, and k... what we have to do is for each row grid[i] in the 2-D matrix we can pick up atmost limits[i] elements, and in the last we need to return the sum of the top k max elements........ please note that we don't need to return the max sum out of each rows and instead we need to find the sum of global top k elements.... so here we used priorityQueue that will store the elements in the decending order for each row...and at last we can poll() for the k elements from the priorityQueue... to get the sum of the top K elements in 2-D matrix...