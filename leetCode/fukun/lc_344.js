var reverseString = function (s) {
    for (let i = 0; i < s.length / 2; i++) {
        let tmp = s[i];
        s[i] = s[s.length - 1 - i];
        s[s.length - 1 - i] = tmp;
    }
    return s;
};
console.log(reverseString(["h", "e", "l", "l", "o"]));