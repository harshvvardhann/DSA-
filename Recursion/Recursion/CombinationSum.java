package Recursion;
import java.util.ArrayList;
import java.util.List;
class CombinationSum {

    public void getAllCombinations(List<List<Integer>> combisum, int[] candidates, int target, List<Integer> arr, int sum, int index) {
        if (sum == target) {
            combisum.add(new ArrayList<>(arr));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                arr.add(candidates[i]);
                getAllCombinations(combisum, candidates, target, arr, sum + candidates[i], i);  // not i + 1 because we can reuse same element
                arr.remove(arr.size() - 1); // backtrack
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        getAllCombinations(combinations, candidates, target, new ArrayList<>(), 0, 0);
        return combinations;
    }
}