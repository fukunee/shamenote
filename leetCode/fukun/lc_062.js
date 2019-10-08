function matrix(m, n) {
    return Array.from({
        length: m
    }, () => new Array(n).fill(0));
}

const uniquePaths = function (m, n) {
    let dp = matrix(m, n);
    dp[0].fill(1);
    dp.forEach((v) => {v[0] = 1});
    for (let i = 1; i < m; i++) {
        for (let j = 1; j < n; j++) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
    }
    return dp[m - 1][n - 1];
};
console.log(uniquePaths(7, 3));