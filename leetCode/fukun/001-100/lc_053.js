const maxSubArray = function (nums) {
    let dp = nums[0];
    let op = nums[0];
    for (let i = 1; i < nums.length; i++) {
        dp = dp > 0 ? dp + nums[i] : nums[i];
        op = Math.max(op, dp);
    }
    return op;
};
console.log(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]));