package ContestProblems;
class SumOfGoodNumbers {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int leftElement = i-k>=0 ? nums[i-k] : -1;
            int rightElement = i+k<nums.length ? nums[i+k] : -1;
            if(nums[i]>leftElement && nums[i]>rightElement) sum += nums[i];
        }
        return sum;
    }
}