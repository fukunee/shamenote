const sortColors = function (nums) {
    let left = 0, right = nums.length - 1, count = 0;
    while (left <= right) {

        if (nums[left] === 0) {
            left++;
            continue;
        }
        if (nums[right] === 2) {
            right--;
            continue;
        }
        if (nums[left] === 1) {
            nums.splice(left, 1);
            count++
            right--;
            continue;
        }
        if (nums[right] === 1) {
            nums.splice(right, 1);
            count++;
            right--;
            continue;
        }
        [nums[left], nums[right]] = [nums[right], nums[left]];
    }
    nums.splice(left, 0, ...(new Array(count).fill(1)));
    return nums;
};
console.log(sortColors([1, 2, 1, 0, 1, 0]));