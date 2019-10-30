const search = function (nums, target) {
    let left = 0,
        right = nums.length - 1;
    while (left < right) {
        let mid = Math.floor((left + right) / 2);
        (nums[0] > nums[mid]) ^ (target > nums[mid]) ^ (nums[0] > target) ? left = mid + 1 : right = mid;
    }
    return nums[left] === target ? left : -1;
};
console.log(search([4, 5, 6, 7, 0, 1, 2, 3], 0));