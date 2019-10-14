const plusOne = function (digits) {
    let tmp = 1;
    let cursor = digits.length - 1;
    while (tmp) {
        if (cursor < 0) {
            digits.unshift(1);
            break;
        }
        if (digits[cursor] + tmp >= 10) {
            digits[cursor] = (digits[cursor] + tmp) % 10;
        } else {
            digits[cursor] += tmp;
            tmp--;
        }
        cursor--;
    }
    return digits;
};
console.log(plusOne([9]));