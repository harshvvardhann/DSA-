package BinaryTrees;
class ValidateBST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return checkValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean checkValidBST(TreeNode root,long min,long max){
        if(root == null) return true;
        if(root.val<=min || root.val>=max) return false;
        return checkValidBST(root.left,min,root.val) && checkValidBST(root.right,root.val,max);
    }
}