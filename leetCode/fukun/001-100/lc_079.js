/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
const exist = function (board, word) {
    const helper = function (row, col, k) {
        if (!word[k]) return true;
        if (!board[row] || !board[row][col]) return false;
        if (board[row][col] === word[k]) {
            board[row][col] = null;
            var output = helper(row - 1, col, k + 1)
                || helper(row + 1, col, k + 1)
                || helper(row, col - 1, k + 1)
                || helper(row, col + 1, k + 1);
            board[row][col] = word[k];
        }
        return !!output;
    };
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            if (helper(i, j, 0)) return true;
        }
    }
    return false;
};
console.log(exist([
    ['A', 'B', 'C', 'E'],
    ['S', 'F', 'E', 'S'],
    ['A', 'D', 'E', 'E']
], "ABCESEEEFS"));