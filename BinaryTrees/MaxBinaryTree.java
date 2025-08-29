package BinaryTrees;

import java.util.HashMap;

public class MaxBinaryTree {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int key){
            val = key;
            left = null;
            right = null;
        }
    }
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int getMaxValue(int nums[],int start,int end){
        int maxAns = -1;
        for(int i=start;i<=end;i++){
            maxAns = Math.max(maxAns,nums[i]);
        }
        return maxAns;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        return getTree(nums,0,nums.length-1);
    }

    public TreeNode getTree(int nums[],int start,int end){
        if(start>end) return null;
        int largestValue = getMaxValue(nums,start,end);
        int index = hm.get(largestValue);
        TreeNode root = new TreeNode(largestValue);
        
        root.left = getTree(nums,start,index-1);
        root.right = getTree(nums,index+1,end);

        return root;
    }
}
