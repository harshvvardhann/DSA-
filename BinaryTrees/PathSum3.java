package BinaryTrees;
import java.util.HashMap;
class PathSum3 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int pathCount = 0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> hm = new HashMap<>();
        hm.put(0L,1);
        return dfs(root,hm,0,targetSum);
    }

    public int dfs(TreeNode root,HashMap<Long,Integer> hm, long prefixSum,int target){
        if(root == null) return 0;

        prefixSum += root.val;

        int count = hm.getOrDefault(prefixSum-target,0);
        hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);

        count += dfs(root.left,hm,prefixSum,target);
        count += dfs(root.right,hm,prefixSum,target);

        hm.put(prefixSum,hm.get(prefixSum)-1);

        return count;
    }
}