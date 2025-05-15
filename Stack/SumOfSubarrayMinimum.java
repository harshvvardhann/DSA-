package Stack;

// this problem is to find the sum of the minimum element of all subarrays of arr
// for each subarray, we need to find the minimum element and add it to the sum
// we can use a nested loop to iterate through the array and for each subarray, we will find the minimum element and add it to the sum
// the time complexity of this solution is O(n^2) and the space complexity is O(1)

class SumOfSubarrayMinimum {
    public int sumSubarrayMins(int[] arr) {
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            int ans = arr[i];
            for(int j=i;j<arr.length;j++){
                ans = Math.min(ans,arr[j]);
                sum += ans; 
            }
        }
        return sum;
    }
}
    