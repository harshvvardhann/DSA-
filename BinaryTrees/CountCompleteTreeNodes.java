package BinaryTrees;
class CountCompleteTreeNodes {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);

        if (leftDepth == rightDepth) {
            // perfect binary tree
            return (1 << leftDepth) - 1;   // 2^leftDepth - 1
        } else {
            // not perfect, recurse
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    int leftDepth(TreeNode root) {
        int hLeft = 0;
        while (root != null) {
            hLeft++;
            root = root.left;
        }
        return hLeft;
    }

    int rightDepth(TreeNode root) {
        int hRight = 0;
        while (root != null) {
            hRight++;
            root = root.right;
        }
        return hRight;
    }
}