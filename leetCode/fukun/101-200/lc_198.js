/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function (nums) {
    if (nums.length === 0) return 0;
    let dp = [nums[0]];
    for (let i = 1; i < nums.length; i++) {
        dp[i] = i > 1 ? Math.max(dp[i - 2] + nums[i], dp[i - 1]) : Math.max(nums[0], nums[1]);
    }
    return dp.pop();
};
console.log(rob([1, 2, 3, 1]));//4