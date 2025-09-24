package BinarySearchTree;
class validPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num/2+1;

        while(left<=right){
            long mid =  left + (right-left)/2;
            long ans = mid * mid;
            if(ans == num){
                return true;
            }else if(ans>num){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
}