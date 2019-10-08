const longestPalindrome = function (str) {
    if (str.length === 0) {
        return '';
    }

    let m = [0, 0];
    let dp = [];
    for (let i = 0; i < str.length; i++) {
        dp[i] = [];
        dp[i][i] = 1;
    }
    for (let i = 0; i < str.length - 1; i++) {
        if (str[i] === str[i + 1]) {
            dp[i][i + 1] = 1;
            m[0] = i;
            m[1] = i + 1;
        }
    }

    for (let res = 2; res < str.length; res++) {
        for (let j = res; i < str.length - res; i++) {
            if (dp[i + 1][res-i] && str[i] === str[i + res]) {
                dp[i][i + res] = dp[i + 1][i + res - 1];
                m[0] = i;
                m[1] = i + res;
            }
        }
    }
    return str.split('').slice(m[0], m[1] + 1).join('');
};
