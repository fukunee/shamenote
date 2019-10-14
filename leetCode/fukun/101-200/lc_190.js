/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function (n) {
    let t = n.toString(2).split('');
    t.unshift(...new Array(32 - t.length).fill(0));
    return parseInt(t.reverse().join(''), 2);
};

console.log(reverseBits(43261596));//3221225471