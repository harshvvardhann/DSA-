package Arrays.Medium;


public class pb4and5MaximumSubarray {

    // TC:O(N)
    public static int maxSubArraySum(int arr[]) {
        int sum = 0;
        int max = arr[0];
        int start = -1;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.println(arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -5, 14, -1, 7, 8 };
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
}
