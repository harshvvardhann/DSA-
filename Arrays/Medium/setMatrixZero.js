// Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.

var setZeroes = function (matrix) {
    const setRow = new Set();
    const setColumn = new Set();
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] === 0) {
                setRow.add(i);
                setColumn.add(j);
            }
        }
    }
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            if (setRow.has(i) || setColumn.has(j)) {
                matrix[i][j] = 0;
            }
        }
    }
    return matrix;
};
