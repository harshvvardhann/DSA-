Array.prototype.groupBy = function (fn) {
    // Object to store grouped elements
    // Key   → result of fn(element)
    // Value → array of elements belonging to that key
    const result = {};

    // Iterate over each element of the array
    for (let i = 0; i < this.length; i++) {
        // Compute the group key using the callback function
        // Example: fn(this[i]) could return 'even', 'odd', category, id, etc.
        const key = fn(this[i]);

        // If this group does not exist yet, initialize it as an empty array
        if (!result[key]) {
            result[key] = [];
        }

        // Push the current element into its corresponding group
        result[key].push(this[i]);
    }

    // Return the grouped object
    // Example output:
    // {
    //   key1: [elements...],
    //   key2: [elements...]
    // }
    return result;
};
