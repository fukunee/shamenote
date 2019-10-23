const moveZeroes = function (nums) {
    let curr = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) {
            nums[curr++] = nums[i];
        }
    }
    while (curr < nums.length) {
        nums[curr++] = 0;
    }
    return nums;
};
console.log(moveZeroes([1, 0, 2, 1, 10, 1, 1, 2, 10, 1, 100, 0, 0, 12, 0]));