package BinarySearchTree;
class SmallestDivisorThreshold {
    public boolean isPossible(int nums[],int k,int mid){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans+=Math.ceil((double)(nums[i])/(double)(mid));
        }
        return ans<=k;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int right = max;
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(isPossible(nums,threshold,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}