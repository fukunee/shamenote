/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {
    while (1) {
        if (n === 1) return true;
        if (n === 4) return false;
        n = n.toString().split('').reduce((a, b) => a + Math.pow(parseInt(b), 2), 0);
    }
};
console.log(isHappy(19));//true