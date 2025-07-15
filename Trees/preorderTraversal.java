package Trees;
import java.util.*;
class Solution {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int key){
            val = key;
            left = null;
            right = null;
        }
    }
    public List<Integer> getPreOrderTraversal(TreeNode root,List<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        getPreOrderTraversal(root.left,list);
        getPreOrderTraversal(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = getPreOrderTraversal(root,list);
        return list;
    }
}