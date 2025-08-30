package BinaryTrees;

class SumRootToLeafNumbers {
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
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currNum) {
        if (node == null) return 0;

        currNum = currNum * 10 + node.val;  // build the number

        // If it's a leaf, return the number formed
        if (node.left == null && node.right == null) {
            return currNum;
        }

        // Otherwise, continue DFS on left + right
        return dfs(node.left, currNum) + dfs(node.right, currNum);
    }
}

