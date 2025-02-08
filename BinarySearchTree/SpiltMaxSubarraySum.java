class Solution {
    int countPartitions(int nums[], int maxSum){
        int n = nums.length;
        int maxSubArraySum = 0;
        int partitions = 1;
        for(int i=0;i<n;i++){
            if(maxSubArraySum + nums[i]<=maxSum){
                maxSubArraySum += nums[i];
            }else{
                partitions++;
                maxSubArraySum = nums[i];
            }
        }
        return partitions;
    }
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;

        for(int i=0;i<nums.length;i++){
            low  = Math.max(low,nums[i]);
            high += nums[i];
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            int partitionns = countPartitions(nums,mid);
            if(partitionns > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}