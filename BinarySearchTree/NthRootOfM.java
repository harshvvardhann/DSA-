package BinarySearchTree;
class NthRootOfM {
    public int getAns(int mid,int n){
        int a = 1;
        for(int i=1;i<=n;i++){
            a = a * mid;
        }
        return a;
    }
    public int nthRoot(int n, int m) {
        // code here
        int left = 1;
        int right = m;
        
        while(left<=right){
            int mid = (left+right)/2;
            int ans = getAns(mid,n);
            if(ans == m){
                return mid;
            }
            else if(ans>m){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}