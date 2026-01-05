package Arrays.Easy;

public class pb8SortedArraySearch {
    public static int sortedArray(int arr[], int left, int right, int k) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };
        System.out.println(sortedArray(arr, 0, arr.length - 1, 14));
    }
}
