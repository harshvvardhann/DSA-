function findLargestElementUsingLoop(arr) {
    if (arr.length === 0) {
        return undefined; // or null, or throw an error
    }
    let largest = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }
    return largest;
}

function findLargestElementUsingMathMax(arr) {
    if (arr.length === 0) {
        return undefined;
    }
    // The spread operator (...) expands the array into individual arguments
    return Math.max(...arr);
}

function findLargestElementUsingReduce(arr) {
    if (arr.length === 0) {
        return undefined;
    }
    return arr.reduce((largest, current) => (current > largest ? current : largest), arr[0]);
}

function findLargestElementUsingSort(arr) {
    if (arr.length === 0) {
        return undefined;
    }
    // Sorts the array in descending order and returns the first element.
    // Note: This method modifies the original array.
    // It's also generally less efficient (O(n log n)) than other methods for this specific task.
    const sortedArr = [...arr].sort((a, b) => b - a);
    return sortedArr[0];
}

// --- Example Usage ---
const arr = [1, 4, 2, 6, 85, 99, 34];

console.log('Using a loop:', findLargestElementUsingLoop(arr));
console.log('Using Math.max(...arr):', findLargestElementUsingMathMax(arr));
console.log('Using reduce():', findLargestElementUsingReduce(arr));
console.log('Using sort():', findLargestElementUsingSort(arr));

// --- Edge Cases ---
const emptyArr = [];
console.log('\n--- Edge Cases ---');
console.log('Empty array with loop:', findLargestElementUsingLoop(emptyArr));
console.log('Empty array with Math.max:', Math.max(...emptyArr)); // Returns -Infinity
console.log('Empty array with reduce:', findLargestElementUsingReduce(emptyArr));
console.log('Empty array with sort:', findLargestElementUsingSort(emptyArr));
