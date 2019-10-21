/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
    if (matrix.length === 0 || matrix[0].length === 0) return false;
    let left = [0, 0], right = [matrix.length - 1, matrix[0].length - 1], mid = [-1, -1];
    while (left[1] <= right[1]) {
        if (left[0] === right[0]) {
            let mid2 = [left[0], Math.floor((left[1] + right[1]) / 2)];
            if (mid[0] === mid2[0] && mid[1] === mid2[1]) return false;
            mid = mid2;
            if (matrix[mid[0]][mid[1]] === target) return true;
            if (matrix[mid[0]][mid[1]] < target) {
                left = [mid[0], mid[1] + 1];
            } else {
                right = mid;
            }
        } else {
            let mid = [Math.floor((left[0] + right[0]) / 2), right[1]];
            if (matrix[mid[0]][mid[1]] === target) return true;
            if (matrix[mid[0]][mid[1]] < target) {
                left = [mid[0] + 1, left[1]];
            } else {
                right = [mid[0], right[1]];
            }
        }
    }
    return false;
};
console.log(searchMatrix([
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 50]
], 5));