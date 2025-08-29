package BinaryTrees;
import java.util.List;
import java.util.ArrayList;
class PathSum2 {
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root,targetSum,list,result);
        return result;
    }

    public void dfs(TreeNode root,int targetSum,List<Integer> list,List<List<Integer>> result){
        if(root == null) return;

        list.add(root.val);

        if(root.left == null && root.right == null && targetSum == root.val){
            result.add(new ArrayList<>(list));
        }else{
            dfs(root.left,targetSum-root.val,list,result);
            dfs(root.right,targetSum-root.val,list,result);
        }

        list.remove(list.size()-1);
    }
}