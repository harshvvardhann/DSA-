package BinaryTrees;

public class MaxBinaryTree2 {
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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root == null || val > root.val){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
    
        root.right = insertIntoMaxTree(root.right,val);
        return root;
    }
}
