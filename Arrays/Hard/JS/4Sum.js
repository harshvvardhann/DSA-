/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function (nums, target) {
    // Result array to collect unique quadruplets
    let resultArr = [];

    // Sort numbers to make it easier to skip duplicates and use two-pointer approach
    nums.sort((a, b) => a - b);

    // Early exit: if there are fewer than 4 numbers, no quadruplets possible
    if (nums.length < 4) return resultArr;

    // Iterate first element
    for (let i = 0; i < nums.length - 3; i++) {
        // Skip duplicate values for the first position to avoid duplicate quadruplets
        if (i > 0 && nums[i] === nums[i - 1]) continue;

        // Iterate second element
        for (let j = i + 1; j < nums.length - 2; j++) {
            // Skip duplicate values for the second position
            if (j > i + 1 && nums[j] === nums[j - 1]) continue;

            // Two-pointer approach for the remaining two numbers (k and l)
            let k = j + 1;
            let l = nums.length - 1;

            // Move pointers inward to find sums equal to target
            while (k < l) {
                let sum = nums[i] + nums[j] + nums[k] + nums[l];

                if (sum === target) {
                    // Found a valid quadruplet
                    resultArr.push([nums[i], nums[j], nums[k], nums[l]]);

                    // Move both pointers inward to continue searching
                    k++;
                    l--;

                    // Skip duplicates for the third number
                    while (k < l && nums[k] === nums[k - 1]) k++;
                    // Skip duplicates for the fourth number
                    while (k < l && nums[l] === nums[l + 1]) l--;
                } else if (sum > target) {
                    // Sum too large -> decrease by moving right pointer left
                    l--;
                } else {
                    // Sum too small -> increase by moving left pointer right
                    k++;
                }
            }
        }
    }

    // Time complexity: O(n^3) due to two nested loops and two-pointer scan
    // Space complexity: O(1) extra (excluding output storage)
    return resultArr;
};
