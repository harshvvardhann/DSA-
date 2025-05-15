package Stack;
import java.util.Arrays;
import java.util.Stack;
// this problem is to find the next greater element for each element in nums
// for each element in nums, we need to find the next greater element in the array
// if there is no greater element, we need to return -1 for that element
// we can use a stack to keep track of the elements in nums and an array to store the next greater element for each element in nums
// we will iterate through nums and for each element, we will check if it is greater than the top of the stack
// if it is, we will pop the stack and put the element in the array as the next greater element for the popped element
// if it is not, we will push the element in the stack
// at the end, we will iterate through the array and for each element, we will check if it is in the array
// if it is, we will return the next greater element for that element


class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        Arrays.fill(arr,-1);
        for(int i=0;i<n*2;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i%n]){
                arr[st.pop()] = nums[i%n];
            }

            if(i<n){
                st.push(i);
            }
        }

        return arr;
        
    }
}