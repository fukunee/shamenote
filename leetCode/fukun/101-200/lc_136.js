const singleNumber = function (nums) {
    return nums.reduce((a, b) => a ^ b);
};
console.log(singleNumber([2, 2, 1]));