// Function to generate a single row of Pascal's triangle (row number: num)
// Uses the mathematical formula: C(n, r) = C(n, r-1) * (n - r) / r
function getPascalList(num) {
    let arr = [];
    let ans = 1;
    arr.push(ans);

    // Calculate remaining elements using the combination formula
    for (let i = 1; i < num; i++) {
        ans = ans * (num - i);
        ans = ans / i;
        arr.push(ans);
    }
    return arr;
}

// Generate Pascal's triangle with numRows rows
var generate = function (numRows) {
    let returnList = [];

    // Generate each row from 1 to numRows
    for (let i = 1; i <= numRows; i++) {
        returnList.push(getPascalList(i));
    }
    return returnList;
};
