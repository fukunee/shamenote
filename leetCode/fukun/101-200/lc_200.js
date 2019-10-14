/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function (grid) {
    let count = 0;
    const helper = function (grid, row, col) {
        if (grid[row] && grid[row][col] && grid[row][col] === "1") {
            grid[row][col] = "0";
            helper(grid, row - 1, col);
            helper(grid, row + 1, col);
            helper(grid, row, col + 1);
            helper(grid, row, col - 1);
        }
    }
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] === "1") {
                helper(grid, i, j);
                count++;
            }
        }
    }
    return count;
};
console.log(numIslands([["1", "1", "1", "1", "0"],
                        ["1", "1", "0", "1", "0"],
                        ["1", "1", "0", "0", "0"],
                        ["0", "0", "0", "0", "0"]]));//1