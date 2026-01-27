/**
 * @param {number[]} nums
 * @return {number[]}
 */
var majorityElement = function (nums) {
    let n = nums.length;

    let mappedObject = nums.reduce((acc, curr) => {
        if (!acc[curr]) acc[curr] = 1;
        else acc[curr]++;
        return acc;
    }, {});

    return Object.keys(mappedObject)
        .filter((num) => mappedObject[num] > n / 3)
        .map(Number);
};
