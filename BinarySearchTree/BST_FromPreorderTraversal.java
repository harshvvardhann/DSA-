package BinarySearchTree;

class BST_FromPreorderTraversal {
    static class TreeNode {
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
    int start = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return dfs(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    } 

    public TreeNode dfs(int preorder[],int min,int max){
        if(start == preorder.length) return null;

        int value = preorder[start];
        if(value < min || value > max) return null;

        TreeNode node = new TreeNode(value);
        start++;

        node.left = dfs(preorder,min,value-1);
        node.right = dfs(preorder,value+1,max);

        return node;
    }  
}