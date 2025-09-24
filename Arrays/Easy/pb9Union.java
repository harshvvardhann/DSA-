package Arrays.Easy;

import java.util.ArrayList;

public class pb9Union {

    public static ArrayList<Integer> sort(int arr1[], int arr2[]) {

        int left = 0;
        int right = arr1.length - 1;
        int left2 = 0;
        int right2 = arr2.length - 1;

        ArrayList<Integer> a = new ArrayList<>();

        while (left <= right && left2 <= right2) {
            if (arr1[left] <= arr2[left2]) {
                if (a.size() == 0 || a.get(a.size() - 1) != arr1[left]) {
                    a.add(arr1[left]);
                }
                left++;
            } else {
                if (a.size() == 0 || a.get(a.size() - 1) != arr2[left2]) {
                    a.add(arr2[left2]);
                }
                left2++;
            }
        }

        while (left <= right) {
            if (a.size() == 0 || a.get(a.size() - 1) != arr1[left]) {
                a.add(arr1[left]);
            }
            left++;
        }

        while (left2 <= right2) {
            if (a.size() == 0 || a.get(a.size() - 1) != arr2[left2]) {
                a.add(arr2[left2]);
            }
            left2++;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 1, 2, 2, 3, 4, 6, 6, 7, 9, 9, 10, 11 };

        ArrayList<Integer> newarr = sort(arr1, arr2);
        System.out.println(newarr);
    }
}
