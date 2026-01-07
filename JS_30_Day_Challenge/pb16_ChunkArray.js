/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    // =======================
    // Solution 1: for loop
    // =======================
    // Time: O(n) → each element visited once
    // Space: O(n) → output array + sliced subarrays
    // Simple, readable, interview-friendly
    let result1 = [];
    for (let i = 0; i < arr.length; i += size) {
        result1.push(arr.slice(i, i + size));
    }

    // =======================
    // Solution 2: reduce
    // =======================
    // Time: O(n) → reduce runs once per element
    // Space: O(n) → accumulator holds all chunks
    // Builds chunks incrementally
    let result2 = arr.reduce((chunks, element) => {
        let last = chunks[chunks.length - 1];
        if (!last || last.length === size) {
            chunks.push([element]);
        } else {
            last.push(element);
        }
        return chunks;
    }, []);

    // =======================
    // Solution 3: Array.from
    // =======================
    // Time: O(n) → slicing covers all elements
    // Space: O(n) → new arrays created by slice
    // Most concise, index-based approach
    let result3 = Array.from({ length: Math.ceil(arr.length / size) }, (_, index) => arr.slice(index * size, index * size + size));

    // Returning one solution (Array.from)
    return result3;
};
