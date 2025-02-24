package ContestProblems.ContestProblems;

import java.util.Arrays;

class minCostToMakeArrayIdentical {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;

        //Step-1 Calculate the direct adjustment cost
        long directAdjustmentCost = 0;
        for(int i=0;i<n;i++){
            directAdjustmentCost += Math.abs(arr[i]-brr[i]);
        }

        //Step-2 Calculate the rearrangement cost
        int sortedArr[] = arr;
        int sortedBrr[] = brr;

        Arrays.sort(sortedArr);
        Arrays.sort(sortedBrr);

        long rearrangementCost = 0;
        for(int i=0;i<n;i++){
           rearrangementCost  += Math.abs(sortedArr[i]- sortedBrr[i]);
        }
        long totalCost = rearrangementCost + k;
        // Step-3 Return the minimum of both strategies
        return Math.min(directAdjustmentCost,totalCost);
    }
}