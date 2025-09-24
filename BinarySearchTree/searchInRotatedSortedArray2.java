package BinarySearchTree;

class searchInRotatedSortedArray2 {
    public int findMin(int[] nums) {
        int left = 0; 
        int right = nums.length-1;
        int min=Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid] == nums[left] && nums[mid] == nums[right]) {
                min = Math.min(min,nums[left]);
                left++;
                right--;
                continue;
            }
            if(nums[left] < nums[right]){
                min = Math.min(min,nums[left]);
                break;
            }
            else if(nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid + 1;
            }else if(nums[mid]<=nums[right]){
                min = Math.min(min,nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }
}