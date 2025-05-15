package TwopointeSlidingWindow;
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
// TC: O(N^2) and SC: O(1)
class MaxConsecutiveOne3 {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int x = k;
            int count = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] == 1) count++;
                else if(nums[j] == 0){
                    if(x>0){
                        count++;
                        x--;
                    }else break;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
    public int longestOnes2(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int zeroes = 0;
        while(right<nums.length) {
            if(nums[right] == 0) zeroes++;

            while(zeroes>k){
                if(nums[left] == 0) zeroes--;
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}