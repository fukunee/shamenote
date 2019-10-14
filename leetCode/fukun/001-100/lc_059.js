const generateMatrix = function (n) {
    let output = [];
    for (let i = 0; i < n; i++) {
        output.push([]);
    }
    let layer = Math.ceil(n / 2);
    let tmp = 1;
    for (let i = 0; i < layer; i++) {
        if (i === n / 2 - 0.5) {
            output[i][i] = tmp;
        }
        for (let j = 0; j < n - 1 - 2 * i; j++) {
            output[i][i + j] = tmp;
            tmp++;
        }
        for (let j = 0; j < n - 1 - 2 * i; j++) {
            output[i + j][n - 1 - i] = tmp;
            tmp++;
        }
        for (let j = 0; j < n - 1 - 2 * i; j++) {
            output[n - 1 - i][n - 1 - i - j] = tmp;
            tmp++;
        }
        for (let j = 0; j < n - 1 - 2 * i; j++) {
            output[n - 1 - i - j][i] = tmp;
            tmp++;
        }
    }
    return output;
};
console.log(generateMatrix(5))