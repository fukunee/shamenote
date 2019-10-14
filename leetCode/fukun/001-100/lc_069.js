// 二分法
const mySqrt = function (x) {
    if (x === 1) return 1;
    let left = 0, right = x;
    while (1) {
        let currN = Math.floor((left + right) / 2);
        if (currN === left) return left;
        currN * currN > x ? (right = currN) : (left = currN);
    }
};
console.log(mySqrt(9));