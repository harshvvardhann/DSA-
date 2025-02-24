package ContestProblems.ContestProblems;
class jump2 {
    public int jump(int[] nums) {
        int end = 0;
        int maxReach = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach,i+nums[i]);
            if(i==end){
                count++;
                end = maxReach;
                if(maxReach >= nums.length-1){
                    break;
                }
            }
        }
        return count;
    }
}