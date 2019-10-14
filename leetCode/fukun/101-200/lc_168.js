var convertToTitle = function (n) {
    let output = [];
    while (n) {
        n--;
        output.unshift(n % 26 + 1);
        n = Math.floor(n / 26);
    }
    return output.reduce((a, b) => {
        return a + String.fromCharCode(64 + b);
    }, "");
};
console.log(convertToTitle(26));