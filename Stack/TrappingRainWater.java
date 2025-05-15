package Stack;

// this problem is to find the amount of water that can be trapped between the bars
// for each bar, we need to find the maximum height of the bar to the left and right of it
// the amount of water that can be trapped on top of the bar is the minimum of the maximum height of the bar to the left and right of it minus the height of the bar
// we can use two pointers to keep track of the maximum height of the bar to the left and right of it
// we will iterate through the array and for each element, we will check if it is greater than the maximum height of the bar to the left and right of it
// if it is, we will update the maximum height of the bar to the left and right of it
// if it is not, we will calculate the amount of water that can be trapped on top of the bar and add it to the total amount of water that can be trapped
// at the end, we will return the total amount of water that can be trapped
// the time complexity of this solution is O(n) and the space complexity is O(1)
class TrappingRainWater {
    public int trap(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int countWater = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[left]<=nums[right]){
                if(nums[left]>=leftMax){
                    leftMax = nums[left];
                }else{
                    countWater += leftMax - nums[left];
                }
                left++;
            }else{
                if(nums[right]>=rightMax){
                    rightMax = nums[right];
                }else{
                    countWater += rightMax - nums[right];
                }
                right--;
            }
        }
        return countWater;
    }
}