var findDisappearedNumbers = function (nums) {
    for (let i = 0; i < nums.length; i++) nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] > 0 ? -nums[Math.abs(nums[i]) - 1] : nums[Math.abs(nums[i]) - 1];
    return nums.reduce((a, b, i) => {
        if (b > 0) a.push(i + 1);
        return a;
    }, []);
};
console.log(findDisappearedNumbers([4, 3, 2, 7, 8, 2, 3, 1]))