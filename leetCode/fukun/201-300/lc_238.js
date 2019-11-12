var productExceptSelf = function (nums) {
    let output = [1];
    for (let i = 1; i < nums.length; i++) {
        output[i] = nums[i - 1] * (output[i - 1]);
    }
    for (let i = nums.length - 2; i >= 0; i--) {
        output[i] *= nums[i + 1];
        nums[i] *= nums[i + 1];
    }
    return output;
};

console.log(productExceptSelf([1, 2, 3, 4]));