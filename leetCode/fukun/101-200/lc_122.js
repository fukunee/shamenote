const maxProfit = function (prices) {
    dp1 = -prices[0];
    dp0 = 0;
    for (let i = 1; i < prices.length; i++) {
        dp1 = Math.max(dp1, dp0 - prices[i]);
        dp0 = Math.max(dp0, dp1 + prices[i]);
    }
    return dp0;
};
console.log(maxProfit([7, 1, 5, 3, 6, 4]));