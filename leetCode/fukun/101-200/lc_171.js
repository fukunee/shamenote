const titleToNumber = function (s) {
    return s.split('').map((v) => v.charCodeAt(0) - 64).reduce((a, b) => a * 26 + b)
};
console.log(titleToNumber("ZY"));