package ContestProblems.ContestProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FindMinCostToRemoveArrayElement {
    public static int minCost(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int totalCost = 0;

        while (list.size() > 3) {
            // Sort first three elements
            Collections.sort(list.subList(0, Math.min(3, list.size())));

            // Pick the smallest two
            int first = list.remove(0);
            int second = list.remove(0);

            // Cost is the max of these two
            totalCost += Math.max(first, second);
        }

        // If 3 or fewer elements remain, remove all at once
        totalCost += Collections.max(list);

        return totalCost;
    }
    public static void main(String[] args) {
        int ans[] = {6,2,8,4};
        int cost = minCost(ans);
        System.out.println(cost);
    }
}