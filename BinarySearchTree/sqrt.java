package BinarySearchTree;
class sqrt {
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            System.out.println(mid+"MID");
            long square = (long)mid * mid;
            if(square==x){
                return mid;
            }
            else if(square>x){
                right = mid - 1;
            }else{
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans = mySqrt(2147395599);
        System.out.println(ans);
    }
}