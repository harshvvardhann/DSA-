package Recursion;
import java.util.ArrayList;
import java.util.List;
class Subsets {

    public void subsets(List<List<Integer>> list,int index,ArrayList<Integer> ar,int nums[]){
        list.add(new ArrayList<>(ar));
        for(int i=index;i<nums.length;i++){
            ar.add(nums[i]);
            subsets(list,i+1,ar,nums);
            ar.remove(ar.size()-1);
        }
    }

    public List<List<Integer>> getAllSubsets(int nums[]){
        List<List<Integer>> ar = new ArrayList<>();
        subsets(ar,0,new ArrayList<>(),nums);
        return ar;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = getAllSubsets(nums);
        return ansList;
    }
    public static void main(String[] args) {
        Subsets s = new Subsets();
        int nums[] = {1,2,3};
        List<List<Integer>> ans = s.subsets(nums);
        System.out.println(ans);
    }
}