package ContestProblems.ContestProblems;

class maxDiffBetAdjEle {
    public int maxAdjacentDistance(int[] nums) {
        int max = -1;
        int diff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            diff = Math.abs(nums[i] - nums[i + 1]);
            if (diff > max) {
                max = diff;
            }
        }
        diff = Math.abs(nums[nums.length - 1] - nums[0]);
        if (diff > max) {
            max = diff;
        }
        return max;
    }
}