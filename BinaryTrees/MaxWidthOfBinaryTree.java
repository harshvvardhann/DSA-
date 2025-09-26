package BinaryTrees;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
class MaxWidthOfBinaryTree {
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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<SimpleEntry<TreeNode, Long>> queue = new LinkedList<>();
        queue.offer(new SimpleEntry<>(root, 0L));

        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            long startIndex = queue.peek().getValue(); // index of first node in level
            long endIndex = startIndex;               // will update with last node

            for (int i = 0; i < size; i++) {
                SimpleEntry<TreeNode, Long> entry = queue.poll();
                TreeNode node = entry.getKey();
                long idx = entry.getValue() - startIndex; // normalize
                if (i == size - 1) endIndex = entry.getValue();
                if (node.left != null)
                    queue.offer(new SimpleEntry<>(node.left, idx * 2 + 1));
                if (node.right != null)
                    queue.offer(new SimpleEntry<>(node.right, idx * 2 + 2));
            }

            maxWidth = Math.max(maxWidth, (int)(endIndex - startIndex + 1));
        }

        return maxWidth;
    }
}