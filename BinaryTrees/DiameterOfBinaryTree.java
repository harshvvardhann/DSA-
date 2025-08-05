package BinaryTrees;
class DiameterOfBinaryTree {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int key) {
            val = key;
            left = null;
            right = null;
        }
    }
    public int diameter = 0;
    public int depth(TreeNode root){
        if(root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        diameter = diameter > left + right ? diameter : left + right;
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }
}