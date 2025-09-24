package BinarySearchTree;
class firstAndLastOccurence {
    public static int lastOccurence(int arr[], int key){
        int left = 0;
        int right = arr.length-1;
        int last = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<=key){
                if(arr[mid]==key){
                    last = mid;
                }

                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return last;
    }
    public static int firstOccurence(int arr[], int key){
        int left = 0;
        int right = arr.length-1;
        int first = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==key){
                right = mid - 1;
                first = mid;
            }else if(arr[mid]<key){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return first;
    } 
    public int[] searchRange(int[] nums, int target) {
        int last=lastOccurence(nums,target);
        int first=firstOccurence(nums,target);
        return new int[]{first,last};
    }
}