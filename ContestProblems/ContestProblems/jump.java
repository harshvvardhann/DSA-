package ContestProblems.ContestProblems;
class jump {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false; // If we are at a point beyond the farthest reachable index
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
            if (maxReachable >= nums.length - 1) {
                return true; // We can reach or exceed the last index
            }
        }
        return false;
    }
}
