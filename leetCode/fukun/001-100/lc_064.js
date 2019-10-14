const minPathSum = function (dp) {
    for (let i = 0; i < dp.length; i++) {
        for (let j = 0; j < dp[0].length; j++) {
            if (i === 0) {
                if (j !== 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            } else {
                if (j === 0) {
                    dp[i][j] += dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + dp[i][j];
                }
            }
        }
    }
    return dp.pop().pop();
};
console.log(minPathSum([
    [1, 3, 1],
    [1, 5, 1],
    [4, 2, 1]
]));