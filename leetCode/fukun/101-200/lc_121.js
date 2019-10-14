const maxProfit = function (prices) {
    let dp1 = -prices[0];
    let dp0 = 0;
    for (let i = 0; i < prices.length; i++) {
        dp1 = Math.max(dp1, -prices[i]);
        dp0 = Math.max(dp1 + prices[i], dp0);
    }
    return dp0;
};

console.log(maxProfit([7, 1, 5, 3, 6, 4]));