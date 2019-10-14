const getPermutation = function (n, k) {
    k--;
    let output = [];

    let candidate = [];
    for (let i = 1; i <= n; i++) {candidate.push(i);}

    let factorial = [1];
    for (let i = 1; i < n; i++) {factorial[i] = factorial[i - 1] * i;}

    for (let i = 0; i < n; i++) {
        let loc = Math.floor(k / (factorial[n - 1 - i]));
        k = k % (factorial[n - 1 - i]);
        output.push(candidate[loc]);
        candidate.splice(loc, 1);
    }
    
    return output.join('');
};

console.log(getPermutation(3, 1));