package BinarySearchTree;
class implementLowerBound {

    static int findFloor(int[] arr, int k) {
        // write code here
        int left = 0;
        int right = arr.length-1;
        int max = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<=k && arr[mid]>max){
                max = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return max;
    }
}