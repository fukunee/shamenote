const majorityElement = function (nums) {
    let tmp = {};
    for (let i = 0; i < nums.length; i++) tmp[nums[i]] = tmp[nums[i]] ? ++tmp[nums[i]] : 1;
    for (v in tmp) if (tmp.hasOwnProperty(v) && tmp[v] > nums.length / 2) return v;
};

console.log(majorityElement([2, 2, 1, 1, 1, 2, 2]));