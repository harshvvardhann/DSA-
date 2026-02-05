/**
 * Binary Search Algorithm
 * Searches for a target value in a sorted array and returns its index
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * @param {number[]} nums - A sorted array of numbers
 * @param {number} target - The value we're searching for
 * @return {number} - The index of target if found, otherwise -1
 */
var search = function (nums, target) {
    // Initialize two pointers: left at start, right at end of array
    let left = 0;
    let right = nums.length - 1;

    // Continue searching while the search space is valid (left <= right)
    while (left <= right) {
        // Calculate middle index to avoid integer overflow
        // Formula: left + (right - left) / 2
        let mid = Math.floor(left + (right - left) / 2);

        // Check if target is at middle position
        if (nums[mid] === target) return mid;
        // If target is greater than middle element,
        // it must be in the right half, so move left pointer
        else if (nums[mid] < target) left = mid + 1;
        // If target is smaller than middle element,
        // it must be in the left half, so move right pointer
        else right = mid - 1;
    }

    // Target not found in the array
    return -1;
};
