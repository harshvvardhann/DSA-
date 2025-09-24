package LearnBasicRecursion;

// 1. Brute Force Method (Using an Auxiliary Array)
// public class ReverseAnArray {
//     public static int[] reverseArray(int[] arr) {
//         int n = arr.length;
//         int[] reversedArr = new int[n];

//         for (int i = 0; i < n; i++) {
//             reversedArr[n - i - 1] = arr[i];
//         }
//         return reversedArr;
//     }

//     public static void main(String[] args) {
//         int[] originalArray = { 1, 2, 3, 4, 5 };
//         int[] reversedArray = reverseArray(originalArray);

//         System.out.println("Original: " + Arrays.toString(originalArray));
//         System.out.println("Reversed: " + Arrays.toString(reversedArray));
//     }
// }

// Complexity:
// Time: 𝑂(𝑛)
// Space: 𝑂(𝑛)(Extra array)


// 2. Two-Pointer Approach (In-place
// public class ReverseAnArray {
//     public static void reverseArray(int[] arr) {
//         int start = 0, end = arr.length - 1;

//         while (start < end) {
//             // Swap
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         reverseArray(arr);

//         System.out.println("Reversed Array: " + Arrays.toString(arr));
//     }
// }

// Complexity:
// Time: 𝑂(𝑛)
// Space: 𝑂(1)



// 3. Recursive Approach

// public class ReverseAnArray {
//     public static void reverseArray(int[] arr, int start, int end) {
//         if (start >= end) {
//             return;
//         }
//         // Swap
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;

//         // Recursive call
//         reverseArray(arr, start + 1, end - 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         reverseArray(arr, 0, arr.length - 1);

//         System.out.println("Reversed Array: " + Arrays.toString(arr));
//     }
// }

// Complexity:
// Time: 𝑂(𝑛)
// Space: 𝑂(n)




// 4. Using Collections (Built-in)
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

// public class ReverseArrayCollections {
//     public static void main(String[] args) {
//         Integer[] arr = {1, 2, 3, 4, 5};
//         List<Integer> list = Arrays.asList(arr);

//         // Reverse the list
//         Collections.reverse(list);

//         System.out.println("Reversed Array: " + list);
//     }
// }

// Complexity:
// Time: 𝑂(𝑛)
// Space: 𝑂(1)



// 5. Using a Stack
// import java.util.Stack;

// public class ReverseAnArray {
//     public static void reverseArray(int[] arr) {
//         Stack<Integer> stack = new Stack<>();

//         // Push all elements into the stack
//         for (int num : arr) {
//             stack.push(num);
//         }

//         // Pop elements back into the array
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = stack.pop();
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         reverseArray(arr);

//         System.out.println("Reversed Array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// Complexity:
// Time: 𝑂(𝑛)
// Space: 𝑂(n) Stack memory



