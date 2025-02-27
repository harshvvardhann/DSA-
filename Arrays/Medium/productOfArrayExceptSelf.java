package Arrays.Medium;

public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixProduct = 1;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        int suffixProduct = 1;
        for(int i=n-1;i>=0;i--){
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
