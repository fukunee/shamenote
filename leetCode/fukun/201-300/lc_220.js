var containsNearbyAlmostDuplicate = function (nums, k, t) {
    let tmp = {};
    for (let i = 0; i < nums.length; i++) {
        for (let j = -t; j <= t; j++) {
            if (tmp[nums[i] + j] !== undefined && (i - tmp[nums[i] + j] <= k)) return true;
        }
        tmp[nums[i]] = i;
    }
    return false;
};
// console.log(containsNearbyAlmostDuplicate([1, 5, 9, 1, 5, 9], 2, 3));
// console.log(containsNearbyAlmostDuplicate([1, 0, 1, 1], 1, 2));
console.log(containsNearbyAlmostDuplicate([1, 2, 3, 1], 3, 0));