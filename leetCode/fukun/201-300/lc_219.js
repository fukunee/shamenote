var containsNearbyDuplicate = function (nums, k) {
    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = 1; j <= k; j++) {
            if (i + j >= nums.length) continue;
            if (nums[i] === nums[i + j]) return true;
        }
    }
    return false;
};
console.log(containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2))
// 以上方法复杂度高
// 可以用map法,单次遍历每一次查找map中对应值的位置，若小于k则返回true,否则覆盖。