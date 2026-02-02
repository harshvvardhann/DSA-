/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function (intervals) {
    // Edge case: if no intervals, return empty array
    if (intervals.length === 0) return [];

    // Step 1: Sort intervals by start value to enable linear scanning
    // This allows us to check overlaps sequentially
    intervals.sort((a, b) => a[0] - b[0]);

    const result = [];
    // Initialize with the first interval
    let [start, end] = intervals[0];

    // Step 2: Iterate through remaining intervals starting from index 1
    for (let i = 1; i < intervals.length; i++) {
        let [currStart, currEnd] = intervals[i];

        // Check if current interval overlaps with the previous one
        // Overlap occurs when current start <= previous end
        if (currStart <= end) {
            // Merge by extending end to the maximum of both intervals
            end = Math.max(end, currEnd);
        } else {
            // No overlap: save the merged interval and start a new one
            result.push([start, end]);
            start = currStart;
            end = currEnd;
        }
    }

    // Don't forget to add the last merged interval
    result.push([start, end]);

    return result;
};
