
var subarraySum = function (arr, k) {
    // Size of the array
    let n = arr.length;

    // Map to store frequency of prefix sums
    const prefixSumCount = new Map();

    // Initialize prefix sum and count of subarrays
    let prefixSum = 0;
    let count = 0;

    // Base case: prefix sum 0 has occurred once
    prefixSumCount.set(0, 1);

    // Traverse through the array
    for (let i = 0; i < n; i++) {
        // Add current element to prefix sum
        prefixSum += arr[i];

        // Calculate the prefix sum that needs to be removed
        const remove = prefixSum - k;

        // If this prefix sum has been seen before,
        // add its count to the result
        if (prefixSumCount.has(remove)) {
            count += prefixSumCount.get(remove);
        }

        // Update the frequency of the current prefix sum
        prefixSumCount.set(prefixSum, (prefixSumCount.get(prefixSum) || 0) + 1);
    }

    // Return the total count of subarrays
    return count;
};
