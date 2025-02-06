class Solution {
    public int getSum(int weights[]){
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
    public int getDays(int weights[],int mid, int days){
        int sum = 0;
        int count = 0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>mid){
                return Integer.MAX_VALUE;
            }
            sum+=weights[i];
            if(sum>mid){
                count++;
                sum=weights[i];
            }
        }
        count++;
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 1;
        int right = getSum(weights);

        while(left<=right){
            int mid = left + (right - left) / 2;
            int day = getDays(weights,mid,days);
            if(day<=days){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        } 

        return left;
    }
}