package BinaryTrees;
class SumOfLeftLeaves {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int result = getSum(root,0,false);
        return result;
    }

    public int getSum(TreeNode root,int finalSum,boolean include){
        if(root == null) return 0;
        if(root.left == null && root.right == null && include) return root.val;
        return getSum(root.left,finalSum,true) + getSum(root.right,finalSum,false);
    }
}