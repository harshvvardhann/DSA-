package BinaryTrees;
import java.util.List;
import java.util.ArrayList;
class PreorderTraversal {
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
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = getPreOrderTraversal(root,list);
        return list;
    }
}