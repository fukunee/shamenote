const addBinary = function (a, b) {
    let ca = 0,
        output = '';
    for (let i = a.length - 1, j = b.length - 1; i >= 0 || j >= 0; i-- , j--) {
        let v = (i >= 0 ? parseInt(a[i]) : 0) + (j >= 0 ? parseInt(b[j]) : 0) + ca;
        output = v % 2 + output;
        ca = v >= 2 ? 1 : 0;
    }
    return ca === 0 ? output : ca + output;
};
console.log(addBinary("11", "1"));
