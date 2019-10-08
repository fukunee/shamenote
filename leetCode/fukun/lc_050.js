const myPow = function (x, n) {
    //参数校验
    if (x===0)return false;
    if (n===0)return 1;

    let s = n.toString(2);
    let value = 1;
    let tmp = n > 0 ? x : (1 / x);
    for (let i = s.length - 1; i >= 0; i--) {
        if (s[i] === "1") value *= tmp;
        tmp *= tmp;
    }
    return value;
};

// 怎么我的算法比轮子还快？？？？
// start: 0.180ms
// ESPow: 0.078ms
// myPow: 0.064ms
// true

console.time("start");
console.timeEnd("start");

console.time("ESPow");
let v2 = Math.pow(-1.0012, 47537535753);
console.timeEnd("ESPow");

console.time("myPow");
let v1 = myPow(-1.0012, 47537535753);
console.timeEnd("myPow");

console.log(v1 === v2);