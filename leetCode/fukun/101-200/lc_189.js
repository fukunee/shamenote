// 移位法
const rotate = function (nums, k) {
    k = k % nums.length;
    let count = 0;
    let i = 0;
    while (count < nums.length) {
        let tmp = nums[i];
        let head = i;
        while (1) {
            count++;
            let next = head - k >= 0 ? head - k : nums.length + head - k;
            if (next === i) {
                nums[head] = tmp;
                break;
            }
            nums[head] = nums[next];
            head = next;
        }
        i++;
    }
    return nums;
};

// 拼接法
// const rotate = function (nums, k) {
//     nums.splice(0, 0, ...nums.splice(nums.length - k));
// };

console.log(rotate([1, 2, 3, 4, 5, 6, 7], 3));