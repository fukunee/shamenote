/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
    let tmp = {},
        output = false;
    nums.forEach(v => {
        if (tmp[v]) output = true;
        tmp[v] = true;
    });
    return output;
};
console.log(containsDuplicate([1, 2, 3, 1]));
