package Arrays.Easy;

public class pb2SecondLargest {
    public static void main(String[] args) {

        // Code for second largest
        int arr[] = { 1, 2, 4, 56, 7, 8, 9 };
        int largest = arr[0];
        int secondlargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);

        // Code for second largest and second smallest.
        // int largest = arr[0];
        int sec = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secsm = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sec) {
                sec = arr[i];
            }

            if (arr[i] < smallest) {
                secsm = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secsm) {
                secsm = arr[i];
            }

        }
        int newa[] = new int[2];
        newa[0] = sec;
        newa[1] = secsm;

    }
}
