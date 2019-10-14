const lengthOfLongestSubstring = function (str) {
    let m = 0;
    let _arr = [];
    for (let i = 0; i < str.length; i++) {
        let idx = _arr.indexOf(str[i]);
        _arr.push(str[i]);
        if (idx >= 0) {
            _arr = _arr.splice(idx + 1);
        }
        m = Math.max(m, _arr.length);
    }
    return m;
};
