package TwopointeSlidingWindow;
import java.util.HashMap;
class SubarrayWithKDifferentIntegers {
    public int getCount(int nums[],int k){
        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;

        while(right<n){
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);

            while(hm.size()>k){
                hm.put(nums[left],hm.get(nums[left])-1);
                if(hm.get(nums[left]) == 0){
                    hm.remove(nums[left]);
                }
                left++;
            }
            count += right-left+1;
            right++;
        }
        return count;     
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
          return getCount(nums,k) - getCount(nums,k-1);
    }
}