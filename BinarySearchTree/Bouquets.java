
class Bouquets {
    public static int getDays(int arr[],int m, int k,int mid){
        int count = 0;
        int newans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= mid){
                count++;  
                if(count == k){  
                    newans++;  
                    count = 0;  
                }
            } else {
                count = 0;  
            }
        }
        return newans;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n = bloomDay.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int left = mini,right=maxi;
        while(left<=right){
            int mid = (left+right)/2;
            int ans = getDays(bloomDay,m,k,mid);
            if(ans<m){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}   