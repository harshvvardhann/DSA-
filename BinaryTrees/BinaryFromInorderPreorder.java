package BinaryTrees;
import java.util.HashMap;
import java.util.Map;
class BinaryFromInorderPreorder {
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
    int preIndex = 0;
    Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // build value -> index map for inorder
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        // pick root from preorder
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // find index in inorder
        int inIndex = inMap.get(rootVal);

        // build left and right
        root.left = helper(preorder, inStart, inIndex - 1);
        root.right = helper(preorder, inIndex + 1, inEnd);

        return root;
    }
}
