// 示例:
//
//     输入: [0,1,0,3,12]
// 输出: [1,3,12,0,0]
// 说明:
//
//     必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/move-zeroes
//     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    let curr = 0;
    for (let i = 0; i < nums.length; i++) nums[i] !== 0 ? nums[curr++] = nums[i] : true;
    while (curr < nums.length) nums[curr++] = 0;
    return nums;
};

console.log(moveZeroes([0, 0, 1]));