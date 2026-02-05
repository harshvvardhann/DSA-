/**
 * Maximum Product Subarray
 * Find the contiguous subarray with the largest product
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach: Use prefix and suffix products traversing from both ends
 * This handles negative numbers and zeros effectively
 *
 * @param {number[]} nums - Array of integers (can include negative numbers and zeros)
 * @return {number} - Maximum product of any contiguous subarray
 */
var maxProduct = function (nums) {
    // Prefix: tracks product from left to right
    let prefix = 1;

    // Suffix: tracks product from right to left
    let suffix = 1;

    // Initialize answer to negative infinity to handle all negative numbers
    let ans = -Infinity;

    // Single pass through the array from both directions
    for (let i = 0; i < nums.length; i++) {
        // Reset prefix to 1 if it becomes 0 (zero breaks the product chain)
        // This allows us to start a fresh subarray after the zero
        if (prefix === 0) prefix = 1;

        // Reset suffix to 1 if it becomes 0 (same reason as prefix)
        if (suffix === 0) suffix = 1;

        // Multiply prefix by current element from left side
        prefix *= nums[i];

        // Multiply suffix by current element from right side
        // nums.length - 1 - i gets the corresponding element from the right
        suffix *= nums[nums.length - 1 - i];

        // Update answer with the maximum of current prefix or suffix product
        // We track both directions because negative numbers can flip the product sign
        ans = Math.max(ans, Math.max(prefix, suffix));
    }

    return ans;
};
