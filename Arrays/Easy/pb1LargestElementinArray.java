package Arrays.Easy;

public class pb1LargestElementinArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 6, 85 };
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}