package Stack;
import java.util.HashMap;
import java.util.Stack;

// this problem is to find the next greater element for each element in nums1 from nums2
// for each element in nums1, we need to find the next greater element in nums2
// if there is no greater element, we need to return -1 for that element
// we can use a stack to keep track of the elements in nums2 and a hashmap to store the next greater element for each element in nums2
// we will iterate through nums2 and for each element, we will check if it is greater than the top of the stack
// if it is, we will pop the stack and put the element in the hashmap as the next greater element for the popped element
// if it is not, we will push the element in the stack
// at the end, we will iterate through nums1 and for each element, we will check if it is in the hashmap

class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ansArray[] = new int[nums1.length];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num: nums2){
            while(!st.isEmpty() && num>st.peek()){
                hm.put(st.pop(),num);
            }
            st.push(num);
        }

        int i=0;
        for(int x:nums1){
            ansArray[i++] = hm.getOrDefault(x,-1);
        }

        return ansArray;
    }
}