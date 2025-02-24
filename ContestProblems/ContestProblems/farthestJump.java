package ContestProblems.ContestProblems;
class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false; // If we are at a point beyond the farthest reachable index
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);//keeps track of the max index till we can reach
            if (maxReachable >= nums.length - 1) {
                return true; // We can reach or exceed the last index
            }
        }
        return false;
    }
}

// maxReachable: This variable keeps track of the farthest index that can be reached from the current position.
// If i > maxReachable: If at any point the current index i is greater than maxReachable, it means that this position is unreachable, so we return false.
// Update maxReachable: We update maxReachable with Math.max(maxReachable, i + nums[i]), ensuring that we always know the farthest index we can jump to from the current position.
// Return true if we can reach the last index: If at any point maxReachable is greater than or equal to the last index, we return true, meaning we can jump to the last position.