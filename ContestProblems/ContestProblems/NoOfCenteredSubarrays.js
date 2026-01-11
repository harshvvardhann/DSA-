/**
 * @param {number[]} nums
 * @return {number}
 */
var centeredSubarrays = function (nums) {
    let centeredSubarrays = 0;

    for (let i = 0; i < nums.length; i++) {
        let sum = 0;
        let obj = {};
        for (let j = i; j < nums.length; j++) {
            obj[nums[j]] = 1;
            sum += nums[j];
            if (obj[sum]) centeredSubarrays++;
        }
    }

    return centeredSubarrays;
};
