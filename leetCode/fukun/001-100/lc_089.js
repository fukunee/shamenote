const grayCode = function (n) {
    let dp = [];
    dp[0] = [0];
    for (let i = 1; i <= n; i++) {
        dp[i] = [];
        for (let j = 0; j < dp[i - 1].length; j++) {
            dp[i].push(dp[i - 1][j] * 2 + j % 2, dp[i - 1][j]*2 + (j + 1) % 2);
        }
    }
    return dp[n];
};
console.log(grayCode(2));