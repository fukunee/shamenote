/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function (n) {
    return n.toString(2).split('').reduce((a, b) => parseInt(a) + parseInt(b), 0);
};
console.log(hammingWeight(2));//1