var findUnsortedSubarray = function (nums) {
    let downMax = -Infinity, upMin = Infinity, left = 0, right = nums.length - 1;
    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i + 1]) {
            downMax = Math.max(downMax, nums[i]);
            upMin = Math.min(upMin, nums[i + 1]);
        }
    }
    if (downMax === -Infinity) return 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] > upMin) {
            left = i;
            break;
        }
    }
    for (let i = nums.length - 1; i >= 0; i--) {
        if (nums[i] < downMax) {
            right = i;
            break;
        }
    }
    return right - left + 1;
};
console.log(findUnsortedSubarray([2, 6, 4, 8, 10, 9, 15]));