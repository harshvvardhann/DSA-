/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function (arr, fn) {
    // return arr.sort((a,b)=>fn(a)-fn(b));

    // return arr.slice().sort((a,b)=>fn(a)-fn(b)); // slice creates a shallow copy, while sort mutates the original array.

    return arr
        .map((item) => ({ item, value: fn(item) }))
        .sort((a, b) => a.value - b.value)
        .map((entry) => entry.item);
};
