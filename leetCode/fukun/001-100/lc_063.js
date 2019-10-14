const uniquePathsWithObstacles = function (dp) {
    dp.forEach((v, i) => {
        v.forEach((v, j) => {
            if (v === 0) {
                dp[i][j] = undefined;
            } else {
                dp[i][j] = 0;
            }
        })
    });
    for (let i = 0; i < dp.length; i++) {
        for (let j = 0; j < dp[0].length; j++) {
            if (dp[i][j] === 0) {continue;}
            if (i === 0 && j === 0) {
                dp[i][j] = 1;
            } else {
                dp[i][j] = (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0);
            }
        }
    }
    return dp.pop().pop();
};
console.log(uniquePathsWithObstacles([
    [0, 0, 0],
    [0, 1, 0],
    [0, 0, 0]
]));