const trailingZeroes = function (n) {
    let output = 0;
    while (n > 0) {
        n = Math.floor(n / 5);
        output += n;
    }
    return output;
};
console.log(trailingZeroes(2147483647));