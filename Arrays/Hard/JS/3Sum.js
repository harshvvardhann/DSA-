/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    let resultArr = [];
    nums.sort((a, b) => a - b);
    for (let i = 0; i < nums.length - 2; i++) {
        // Skip duplicate values for i
        // If current value same as previous, skip to avoid duplicate triplets
        if (i > 0 && nums[i] === nums[i - 1]) continue;

        let left = i + 1;
        let right = nums.length - 1;
        while (left < right) {
            let sum = nums[i] + nums[left] + nums[right];
            if (sum === 0) {
                resultArr.push([nums[i], nums[left], nums[right]]);

                // Skip duplicate values for left pointer
                // Move left until we find a different value
                while (left < right && nums[left] === nums[left + 1]) left++;
                // Skip duplicate values for right pointer
                // Move right until we find a different value
                while (left < right && nums[right] === nums[right - 1]) right--;

                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
    return resultArr;
};
