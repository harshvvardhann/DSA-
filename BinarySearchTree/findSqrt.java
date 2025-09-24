package BinarySearchTree;
class findSqrt {
    int floorSqrt(int n) {
        // Your code here
        int ans = 1;
        int left = 1,right = n;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid*mid<=n){
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
