package TwopointeSlidingWindow;

class NiceSubarray {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;
        int res = 0, left = 0, n = nums.length, right = 0;
        int sum = 0;
        while (right < n) {
            sum += nums[right]%2;
            while (sum > goal) {
                sum -= nums[left]%2;
                left++;
            }
            res += right - left + 1;
            right++;
        }
        return res;
    }
}