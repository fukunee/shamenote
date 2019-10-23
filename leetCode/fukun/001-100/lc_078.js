/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function (nums) {
    return nums.reduce((a, b) => a.concat(a.map(v => v.concat(b))), [[]]);
};
console.log(subsets([1, 2, 3]));