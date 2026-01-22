// Rotate the given n x n 2D matrix by 90 degrees (clockwise) in-place.
// You have to rotate the matrix in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
// Intuition: First transpose the matrix and then reverse each row to get the rotated matrix.

var rotate = function (matrix) {
    for (let i = 0; i < matrix.length; i++) {
        for (let j = i; j < matrix[i].length; j++) {
            [matrix[i][j], matrix[j][i]] = [matrix[j][i], matrix[i][j]];
        }
    }

    for (let x = 0; x < matrix.length; x++) {
        matrix[x].reverse();
    }

    return matrix;
};
